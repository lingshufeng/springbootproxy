### springboot 配置服务代理
CSDN博客地址    [凌大大博客](https://blog.csdn.net/wohaqiyi/article/details/81327512)
&emsp;&emsp;有时候，我们可能有下边这样的需求：
![image](https://github.com/lingshufeng/images/blob/master/images/1.png)
即，针对于分布式服务，我们会有多种业务接口服务，但是服务器上可能只要求开放一个服务的端口，比如上图的`restA`项目端口是对外开放的，但是`restB`项目端口并未对外开放，这样带来的问题就是，用户无法直接请求`restB`项目。
&emsp;&emsp;那就想到了可以通过访问`restA` ,请求路径符合一定规范的时候，比如`http://ip:port/test` ,当请求中以`rest` 开头时，可以再转发请求到`restB` 项目中即可。

&emsp;&emsp;当然`代理转发` ，有很多的解决办法，`nginx`  、`zuul` 等都可以实现，但是`nginx` 虽然简单，但是总要多装一个服务；`zuul` 配置较为麻烦。
&emsp;&emsp;经过百度后，发现了一个特别简单的配置，即这里要说的东西，`ServletRegistrationBean`的注入，相当于是引入`servlet` ，没有具体看过 。
![image](https://github.com/lingshufeng/images/blob/master/images/%E3%80%90%E8%A1%A8%E6%83%85%E3%80%91%E7%8C%AB%E7%9C%AF%E7%9C%BC%E7%9D%9B.png)

### 下面写一下配置步骤：
##### 1、项目结构及介绍
&emsp;&emsp;下面是我的项目结构，以下选中蓝色的项目为我们要配置的项目，其他的项目先忽略，是我们基于`dubbo` 和`zookeeper` 配置的时候用的。
&emsp;&emsp;项目已放到`GitHub` 上，下载[项目GitHub地址](https://github.com/lingshufeng/springbootproxy)
![image](https://github.com/lingshufeng/images/blob/master/images/2.png)
&emsp;&emsp;关于这个项目的介绍是下边这样的，再配张图来介绍下：

![image](https://github.com/lingshufeng/images/blob/master/images/3.png)
&emsp;&emsp;`suiteone` 、`suitetwo` 项目端口没有外放，用户不能直接访问，而`master`项目是可以直接访问的，所以用户是通过访问`master` 项目，再由`master` 项目对请求代理转发到这两个项目中。
##### 2、具体配置步骤
&emsp;&emsp; 主要的配置很少，都在`master` 项目中。
###### （1）引入依赖：

```
 <!--ProxyFilter的引入依赖-->
      <dependency>
          <groupId>org.mitre.dsmiley.httpproxy</groupId>
          <artifactId>smiley-http-proxy-servlet</artifactId>
          <version>1.7</version>
      </dependency>
```
###### （2）、配置一个配置类：
&emsp;&emsp;该类可以参照下载下来的`master` 项目中的配置。
```
package microservice.sc.config;

import org.mitre.dsmiley.httpproxy.ProxyServlet;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
/**
 * Created by lsf on 2018/7/31.
 */
@Configuration
public class ProxyServletConfiguration implements EnvironmentAware {
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new ProxyServlet(), propertyResolver.getProperty("servlet_url_one"));
        //这个setName必须要设置，并且多个的时候，名字需要不一样
        servletRegistrationBean.setName("suitone");
        servletRegistrationBean.addInitParameter("targetUri", propertyResolver.getProperty("target_url_one"));
        servletRegistrationBean.addInitParameter(ProxyServlet.P_LOG, propertyResolver.getProperty("logging_enabled", "false"));
        return servletRegistrationBean;
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean2(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new ProxyServlet(), propertyResolver.getProperty("servlet_url_two"));
        //这个setName必须要设置，并且多个的时候，名字需要不一样
        servletRegistrationBean.setName("suittwo");
        servletRegistrationBean.addInitParameter("targetUri", propertyResolver.getProperty("target_url_two"));
        servletRegistrationBean.addInitParameter(ProxyServlet.P_LOG, propertyResolver.getProperty("logging_enabled", "false"));
        return servletRegistrationBean;
    }

    private RelaxedPropertyResolver propertyResolver;

    @Override
    public void setEnvironment(Environment environment) {
        this.propertyResolver = new RelaxedPropertyResolver(environment, "proxy.test.");
    }
}

```
###### （3）、配置代理地址：
&emsp;&emsp;到`master` 项目的主配置文件，即`application.properties` 文件中，加入以下内容：

```
#请求testone时代理转发到30001项目中
proxy.test.servlet_url_one=/testone/*
proxy.test.target_url_one=http://localhost:30001

#请求testtwo时代理转发到30002项目中
proxy.test.servlet_url_two=/testtwo/*
proxy.test.target_url_two=http://localhost:30002
```
&emsp;&emsp;上边的配置简单介绍一下，对于`testone/*` 这样的写法，意思就是当你的请求路径以`testone` 开头，比如`http://localhost:30000/testone/test/get1` 这样的路径，它请求的真实路径是`http://localhost:30001/test/get1` 。主要就是将`testone` 替换成对应的被代理路径而已，<font color='#f00'>**`*` 的意思就是实际请求项目中接口的路径！！！**</font>
&emsp;&emsp;`30001` 端口即`suiteone`项目，`30002` 端口即`suitetwo` 项目，下载项目之后，分别启动`master` 、`suiteone` 、`suitetwo` 项目的启动类，启动完成后，访问`http://localhost:30000/testone/test/get1` ，即会返回`suiteone` 项目`test/get1` 接口的内容。
&emsp;&emsp;这种配置对`get` 、`post` 请求都有效。
&emsp;&emsp;以上即是完整的配置内容。
&emsp;&emsp;如果有不懂的，可以下载下来项目看一下。[GitHub地址](https://github.com/lingshufeng/springbootproxy)

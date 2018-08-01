package microservice.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
/**
 * 主项目启动项位置
 */
@SpringBootApplication
//@ImportResource("classpath:dubbo-consumer.xml") //引入dubbo配置
public class MasterBootApplication{
    public static void main( String[] args ){
    	SpringApplication.run(MasterBootApplication.class, args);
    }

}

package microservice.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Administrator on 2018/7/31.
 */
@SpringBootApplication
@ImportResource("classpath:dubbo-consumer.xml") //引入dubbo配置
public class AppRestApplication {
    public static void main( String[] args ){
        SpringApplication.run(AppRestApplication.class, args);
    }

}

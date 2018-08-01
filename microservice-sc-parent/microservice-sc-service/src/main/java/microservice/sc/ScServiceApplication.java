package microservice.sc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@SpringBootApplication
@EnableTransactionManagement
@ImportResource("classpath:dubbo-provider.xml")
@MapperScan("microservice.sc.mapper")
public class ScServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ScServiceApplication.class, args);
	}
 
}

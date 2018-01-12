import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) throws Exception{
		ConfigurableApplicationContext context = SpringApplication.run(ClientApplication.class, args);
	}
}

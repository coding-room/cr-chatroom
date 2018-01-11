package cr.chatroom;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ChatroomApplication {

	public static void main(String[] args) throws Exception{
		ConfigurableApplicationContext context = SpringApplication.run(ChatroomApplication.class, args);
		WebSocketServer webSocketServer = context.getBean(WebSocketServer.class);
		webSocketServer.start();
	}
}

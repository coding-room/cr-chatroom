package chatroom;


import chatroom.ws.WebSocketServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) throws Exception{
		ConfigurableApplicationContext context = SpringApplication.run(ServerApplication.class, args);
		WebSocketServer webSocketServer = context.getBean(WebSocketServer.class);
		webSocketServer.start();
	}
}

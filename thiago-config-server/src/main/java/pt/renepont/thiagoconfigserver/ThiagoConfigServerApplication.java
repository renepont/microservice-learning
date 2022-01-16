package pt.renepont.thiagoconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ThiagoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThiagoConfigServerApplication.class, args);
	}

}

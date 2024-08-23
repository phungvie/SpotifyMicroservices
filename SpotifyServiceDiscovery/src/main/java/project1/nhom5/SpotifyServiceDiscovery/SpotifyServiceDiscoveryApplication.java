package project1.nhom5.SpotifyServiceDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class SpotifyServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpotifyServiceDiscoveryApplication.class, args);
	}

}

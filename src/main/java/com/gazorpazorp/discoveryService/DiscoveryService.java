package com.gazorpazorp.discoveryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//Random Comment because changes
@EnableEurekaServer
@SpringBootApplication
public class DiscoveryService {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryService.class, args);
	}
}

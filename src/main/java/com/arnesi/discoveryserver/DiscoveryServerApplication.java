package com.arnesi.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServerApplication {

	public static void main(String[] args) {
		//Basic Discovery Server Conf.
		SpringApplication.run(DiscoveryServerApplication.class, args);
	}

}

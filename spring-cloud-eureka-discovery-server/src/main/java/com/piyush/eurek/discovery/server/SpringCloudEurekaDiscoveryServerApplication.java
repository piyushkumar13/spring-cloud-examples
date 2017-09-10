package com.piyush.eurek.discovery.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaDiscoveryServerApplication.class, args);
	}
}

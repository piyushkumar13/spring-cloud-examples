package com.piyush.eureka.hello.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudEurekaHelloServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaHelloServiceApplication.class, args);
	}
}

package com.piyush.eureka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Here @EnableCircuitBreaker is used to enable the circuit breaker which is one of the feature of the hysterix. We can
 * enable the hysterix dashboard by using @EnableHystrixDashboard annotation. And we can access the hysterix dashboard
 * at http://localhost:${port of this service}/hystrix and also, we need to configure the stream by entering
 * "http://localhost:${port of this service}/hystrix.stream" in the dashboard textbox for the stream.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableHystrixDashboard
public class SpringCloudEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServiceApplication.class, args);
    }
}

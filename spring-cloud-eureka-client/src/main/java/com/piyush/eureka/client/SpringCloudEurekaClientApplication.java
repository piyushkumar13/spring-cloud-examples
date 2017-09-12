package com.piyush.eureka.client;

import com.piyush.eureka.client.hysterixbean.EurekaClientForHysterix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudEurekaClientApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringCloudEurekaClientApplication.class, args);
        EurekaClientForHysterix eurekaClientForHysterix = (EurekaClientForHysterix) context.getBean("eurekaClientForHysterix");
        for (int i =0 ; i<100; i++) {
            //Adding this loop for the hyterix circuit breaker to get open.
            eurekaClientForHysterix.getMessageFromClient();
        }
    }
}

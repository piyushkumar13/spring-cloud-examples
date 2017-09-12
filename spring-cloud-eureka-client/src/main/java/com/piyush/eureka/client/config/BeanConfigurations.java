package com.piyush.eureka.client.config;

import com.piyush.eureka.client.hysterixbean.EurekaClientForHysterix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigurations {

    @Bean
    public EurekaClientForHysterix eurekaClientForHysterix(){
        return new EurekaClientForHysterix();
    }
}

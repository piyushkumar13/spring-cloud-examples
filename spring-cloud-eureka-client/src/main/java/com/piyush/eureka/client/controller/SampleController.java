package com.piyush.eureka.client.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by pkumar on 9/9/17.
 */
@RestController
public class SampleController {


    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private RestTemplateBuilder templateBuilder;

    @RequestMapping(value = "/message/client", method = RequestMethod.GET)
    public String getMessageFromClient() {
        RestTemplate restTemplate = templateBuilder.build();

        InstanceInfo info = eurekaClient.getNextServerFromEureka("my-service", false);
        String homePageUrl = info.getHomePageUrl();
        String finalUrl = homePageUrl +"message";

        String str = restTemplate.getForObject(finalUrl, String.class);
        return str;
    }
}

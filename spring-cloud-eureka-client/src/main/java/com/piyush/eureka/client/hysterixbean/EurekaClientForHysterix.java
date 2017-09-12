package com.piyush.eureka.client.hysterixbean;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

/**
 * Created by pkumar on 9/13/17.
 */
public class EurekaClientForHysterix {

    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private RestTemplateBuilder templateBuilder;

    public void getMessageFromClient() {
        RestTemplate restTemplate = templateBuilder.build();

        InstanceInfo info = eurekaClient.getNextServerFromEureka("my-service", false);
        String homePageUrl = info.getHomePageUrl();
        String finalUrl = homePageUrl +"message";

        String str = restTemplate.getForObject(finalUrl, String.class);
        System.out.println("The returned message is ::: " + str);
    }
}

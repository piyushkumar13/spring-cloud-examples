package com.piyush.eureka.service.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pkumar on 9/9/17.
 */
@RestController
public class SampleController {

    @Value("${service.instance.name}")
    private String instanceName;

    @RequestMapping(value = "/message", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "getDefaultMessage")
    public String getMessage(){
        System.out.println("Inside getMessage :::: ");
        if ("instance1".equalsIgnoreCase(instanceName)){
            //Adding this for the hysterix example. We can also remove it.
            throw new RuntimeException();
        }
        return "Hello from instance :::: " + instanceName;
    }

    public String getDefaultMessage(){
        System.out.println("Inside hysterix method getDefaultMessage :::: ");
        return "Hello from hysterix";
    }
}

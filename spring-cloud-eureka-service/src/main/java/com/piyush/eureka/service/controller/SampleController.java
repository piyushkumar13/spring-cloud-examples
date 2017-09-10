package com.piyush.eureka.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
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
    public String getMessage(){
        return "Hello from instance :::: " + instanceName;
    }
}

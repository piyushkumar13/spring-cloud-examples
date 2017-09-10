package com.piyush.ribbon.client.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by pkumar on 9/10/17.
 */

@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon/client", method = RequestMethod.GET)
    public String getMessage(){
        return restTemplate.getForObject("http://my-service/message",String.class);
    }
}

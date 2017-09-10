package com.piyush.eureka.hello.service.controllers;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Piyush Kumar
 *
 * When we call the hello service via gateway service(i.e Zuul project). The hello service will be located by the url
 * httt://${hostname of gateway service}:${port of gateway service}/${/service_id i.e /hello-service}/${request mapping i.e /hello}
 * */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHelloMessage(@RequestHeader("name") String name){

        return "Hello! My name is ::: " + name;
    }
}

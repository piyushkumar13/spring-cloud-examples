package com.piyush.eureka.bye.service.controllers;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Piyush Kumar
 *
 * When we call the bye service via gateway service(i.e Zuul project). The bye service will be located by the url
 * httt://${hostname of gateway service}:${port of gateway service}/${/service_id i.e /bye-service}/${request mapping i.e /bye}
 * */
@RestController
public class ByeController {

    @RequestMapping(value = "/bye", method = RequestMethod.GET)
    public String getByeMsg(@RequestHeader("name") String name){
        return "Bye :::: " + name;
    }
}

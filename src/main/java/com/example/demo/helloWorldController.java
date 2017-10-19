package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

    @Value("${cupSize}")
    private String cupSize;

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public  String say(){
        return "hello spring boot!" + cupSize;
    }
}

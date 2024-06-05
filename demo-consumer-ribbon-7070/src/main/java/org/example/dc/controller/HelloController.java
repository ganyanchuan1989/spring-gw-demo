package org.example.dc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class HelloController {

    private static final String HOST = "http://DEMO-APP";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String sayHello(){
        return restTemplate.getForObject(HOST + "/test/hello", String.class);
    }
}

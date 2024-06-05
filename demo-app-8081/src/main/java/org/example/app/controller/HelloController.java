package org.example.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "8081 Hello World ss" + Math.random();
    }
}

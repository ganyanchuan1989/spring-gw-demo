package org.example.gw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixFallbackController {

    @RequestMapping("/hystrixfallback")
    public String fallback(){
         return "<html><body><div><h1>Hystrix fallback</h1></div></body></html>";
    }
}

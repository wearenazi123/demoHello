package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index() {
        System.out.println("Hello");

        for(int i=0;i<10;i++){
            System.out.println(i);
        }
        return "Hello World";
    }
}

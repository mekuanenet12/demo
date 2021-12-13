package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDockerController {

    @RequestMapping
    public String helloWorld(){
        return "Hello world";
    }
}

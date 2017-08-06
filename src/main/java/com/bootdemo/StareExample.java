package com.bootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MrSpin on 2017/8/6.
 */
@RestController
@EnableAutoConfiguration
public class StareExample {
    @RequestMapping("/hello")
    String home() {
        return "Hello Spring Boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(StareExample.class, args);

    }

}

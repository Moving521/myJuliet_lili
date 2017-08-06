package com.bootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MrSpin on 2017/8/6.
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/helloboot")
    String home() {
        return "Hello Spring Boot";
    }
}

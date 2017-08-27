package com.neo.controller;

import com.neo.service.user.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MrSpin on 2017/8/6.
 */
@RestController
public class HelloWorldController {
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/helloboot")
    String home() {
        userInfoService.login("MrSpin","Moving521");
        return "Hello Spring Boot";
    }
}

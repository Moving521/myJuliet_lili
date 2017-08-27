package com.neo;

import com.neo.service.user.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MrSpin on 2017/8/6.
 */
@RestController
@ComponentScan(basePackages ={"com.neo"})
@EnableAutoConfiguration
public class Application {


    @Autowired
    UserInfoService userInfoService;//注入Simple

    @RequestMapping("/hello")
    String home() {
        return "Hello Spring Boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

}

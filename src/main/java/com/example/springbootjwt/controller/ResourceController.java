package com.example.springbootjwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-jwt
 * @description: HelloWorldController
 * @author: loulvlin
 * @create: 2020-10-29 13:24
 */
@RestController
public class ResourceController {

    @RequestMapping("/hellouser")
    public String getUser()
    {
        return "Hello User";
    }

    @RequestMapping("/helloadmin")
    public String getAdmin()
    {
        return "Hello Admin";
    }
}

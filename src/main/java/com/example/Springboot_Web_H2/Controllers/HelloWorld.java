package com.example.Springboot_Web_H2.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping("/Hello")
    public String Hello() {
        return "Hello Spring Boot!";
    }
}

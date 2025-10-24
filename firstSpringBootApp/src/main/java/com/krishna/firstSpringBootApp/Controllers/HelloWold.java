package com.krishna.firstSpringBootApp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/helloWold")
public class HelloWold {

    @GetMapping("/")
    public String helloWold() {
        return "Hello Java Spring Boot";
    }

    @GetMapping("/{name}")
    public String greet(@PathVariable String name) {
        return "Welcome to Java Spring Boot world " + name + "!";
    }
}

package com.devops.devopsjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Devops {
    @GetMapping("/welcome")
    public String home() {
        return "<h1>Welcome to DevOps with Java!!! v3.0.0</h1>";
    }
}

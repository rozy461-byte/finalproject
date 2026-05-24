package com.example.finalproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/health")
    public String index() {
        return "Health Check: OK";
    }
}

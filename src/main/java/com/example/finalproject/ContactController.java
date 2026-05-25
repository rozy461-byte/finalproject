package com.example.finalproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contactontroller {
    @GetMapping("/contact")
    public String index() {
        return "This is contact controller";
    }
}
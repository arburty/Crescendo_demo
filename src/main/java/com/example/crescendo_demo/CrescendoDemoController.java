package com.example.crescendo_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrescendoDemoController {

    @GetMapping(value = "/")
    public String root() {
        return "Hello World";
    }
}

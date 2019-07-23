package com.karsha.resmbs.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topic1 {

    @RequestMapping("/topic1/bubble")
    String home() {
        return "Hello bubble!";
    }
}

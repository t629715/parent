package com.example.cloud.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/testController")
@RestController
public class TestController {
    @GetMapping("/testQuest")
    public String testQuest(){
        return "ok";
    }
}

package com.example.springboot_quick2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickController {
    @RequestMapping("/quick2")
    public String quick(){

        return "springboot test sucess hahah!!!";
    }


}

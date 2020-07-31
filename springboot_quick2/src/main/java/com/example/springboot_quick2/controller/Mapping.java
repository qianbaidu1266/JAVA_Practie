package com.example.springboot_quick2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Mapping {

    @Value("${name}")
    private String name;

    @Value("${person.addr}")
    private String addr;


    @RequestMapping("/Mapping")
    @ResponseBody
    public String Mapping(){
        //获取配置文件信息
        return "name:"+name+",addr:"+addr;
    }

}

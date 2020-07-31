package com.example.springboot_quick2.controller;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@ConfigurationProperties(prefix = "person")
@Component
public class MapValue {

    private String name;
    private String addr;

    @RequestMapping("/Map")
    @ResponseBody
    public String Mapping(){
        //获取配置文件信息
        return "name:"+name+",addr:"+addr;
    }

}
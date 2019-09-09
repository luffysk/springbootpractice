package com.xxx.config.conf.controller;

import com.xxx.config.conf.po.Dog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DogController {
    @Resource
    Dog dog;
    @GetMapping("/doginfo")
    public String dogInfo(){
        return dog.toString();
    }
}

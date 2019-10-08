package com.xxx.integrate.config;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalConfig {
    @ModelAttribute(value = "info")
    public Map<String,String> persons(){
        Map<String, String> map = new HashMap<>();
        map.put("username","zhangsan");
        map.put("age", "10");
        return map;
    }

    @InitBinder("b")
    public void initBook(WebDataBinder binder){
        binder.setFieldDefaultPrefix("b.");
    }
    @InitBinder("a")
    public void initAuthor(WebDataBinder binder){
        binder.setFieldDefaultPrefix("a.");
    }
}

package com.xxx.integrate.controller;

import com.xxx.integrate.po.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class PersonController {
    @GetMapping("/persons")
    public ModelAndView persons(){
        ModelAndView mv = new ModelAndView();
        List<Person> persons = new ArrayList<Person>();
        Person p1 = new Person();
        p1.setName("张三");
        p1.setAge(10);
        Person p2 = new Person();
        p2.setName("李四");
        p2.setAge(20);
        persons.add(p1);
        persons.add(p2);
        mv.addObject("persons", persons);
        mv.setViewName("persons");
        return mv;
    }
    @ResponseBody
    @GetMapping("/testJson")
    public Person testJson(){
        Person p = new Person();
        p.setName("王五");
        p.setAge(30);
        p.setBirthday(new Date());
        return p;
    }
}


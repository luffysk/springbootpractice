package com.xxx.integrate.controller;

import com.xxx.integrate.po.Author;
import com.xxx.integrate.po.Book;
import com.xxx.integrate.po.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

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
        int i = 1/0;
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
    @ResponseBody
    @GetMapping("/testGlobalConfig")
    public void testGlobalConfig(Model model){
        Map<String, Object> map = model.asMap();
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Object val = map.get(key);
            System.out.println(key + " : "+ val);

        }

    }

    @ResponseBody
    @GetMapping("/books")
    public String books(@ModelAttribute("b") Book book, @ModelAttribute("a") Author author){
        return book.toString() +" : " + author.toString();
    }
}


package com.xxx.integrate.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    @PostMapping("/")
   // @CrossOrigin(value = "http://localhost:8081",maxAge = 1800,allowedHeaders = "*")
    public String addBook(String name){
        return "get data: "+ name;
    }
    @DeleteMapping("/{id}")
    public Integer delBookById(@PathVariable Integer id){
        return id;
    }
}

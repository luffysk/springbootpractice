package com.xxx.integrate_data.controller;

import com.xxx.integrate_data.pojo.Book;
import com.xxx.integrate_data.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/crud")
    public void bookCRUD(){
        Book book = new Book();
        book.setName("book3");
        book.setAuthor("author3");
        System.out.println(bookService.addBook(book));
        book.setId(3);
        book.setName("book333");
        System.out.println(bookService.updateBook(book));
        System.out.println(bookService.deleteBook(1));
        System.out.println(bookService.getAllBook());
    }
}

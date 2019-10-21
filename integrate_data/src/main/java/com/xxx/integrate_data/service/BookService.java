package com.xxx.integrate_data.service;

import com.xxx.integrate_data.dao.BookDao;
import com.xxx.integrate_data.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public int addBook(Book book){
        return bookDao.addBook(book);
    }

    public int updateBook(Book book){
        return bookDao.updateBook(book);
    }

    public int deleteBook(int id){
        return bookDao.deleteBook(id);
    }

    public List<Book> getAllBook(){
        return bookDao.getAllBook();
    }
}

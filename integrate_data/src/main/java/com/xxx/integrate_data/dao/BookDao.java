package com.xxx.integrate_data.dao;

import com.xxx.integrate_data.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public int addBook(Book book){
        return jdbcTemplate.update("INSERT INTO book(name, author) VALUES(?,?)",book.getName(),book.getAuthor());
    }

    public int updateBook(Book book){
        return jdbcTemplate.update("UPDATE book SET name=?,author=? WHERE id=?", book.getName(),book.getAuthor(),book.getId());
    }

    public int deleteBook(int id){
        return jdbcTemplate.update("DELETE FROM book WHERE id=?", id);
    }

    public List<Book> getAllBook(){
        return jdbcTemplate.query("SELECT * FROM book", new BeanPropertyRowMapper<>(Book.class));
    }
}

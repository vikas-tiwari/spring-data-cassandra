package com.home.cassandra.springdatacassandra.controller;

import com.home.cassandra.springdatacassandra.entity.Book;
import com.home.cassandra.springdatacassandra.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.*;

import java.util.ArrayList;

@RestController
public class BookController {

    @Autowired
    BookRepository bookrepo;

    @RequestMapping("/")
    public String printMessage() {
        return "Hello World";
    }

    @PostConstruct
    public void saveBooks() {
//        List<Book> books = new ArrayList<>();
//        books.add(new Book("1", "Java", "James"));
//        books.add(new Book("2", "C++" , "Chris"));
//        books.add(new Book("3", "Python", "Austin"));
//        bookrepo.saveAll(books);
    }

    @GetMapping("/getAllBooks")
    public List<Book> getBooks() {
        return bookrepo.findAll();
    }

    @GetMapping("/getBookById/{id}")
    public List<Book> getBooksById(@PathVariable  String id) {
        return bookrepo.findAllById(id);
    }
}

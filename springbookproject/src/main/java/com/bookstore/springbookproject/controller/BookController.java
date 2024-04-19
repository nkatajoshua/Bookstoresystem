package com.bookstore.springbookproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.springbookproject.entity.Book;
import com.bookstore.springbookproject.service.BookService;

import cn.hutool.http.HttpStatus;

@RestController
@RequestMapping("/api/books")
public class BookController {
    
    @Autowired
    private BookService bookService;
    
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = bookService.findById(id);
        return ResponseEntity.ok(book);
    }
    
    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Book savedBook = bookService.save(book);
        return ResponseEntity.status(HttpStatus.HTTP_CREATED).body(savedBook);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBookById(@PathVariable Long id) {
        bookService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

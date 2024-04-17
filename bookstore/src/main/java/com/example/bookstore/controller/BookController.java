package com.example.bookstore.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/api/books")
    public String getAllBooks() {
        return "List of books";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/api/books/create")
    public String createBook() {
        return "Create a new book";
    }
}

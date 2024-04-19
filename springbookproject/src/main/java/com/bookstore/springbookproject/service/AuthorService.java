package com.bookstore.springbookproject.service;

import java.util.List;

import com.bookstore.springbookproject.entity.Author;

public interface AuthorService {

    List<Author> findAll();

    Author findById(Long id);

    Author save(Author author);

    void deleteById(Long id);
}

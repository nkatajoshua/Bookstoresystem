package com.bookstore.springbookproject.service;

import com.bookstore.springbookproject.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();

    Category findById(Long id);

    Category save(Category category);

    void deleteById(Long id);
}

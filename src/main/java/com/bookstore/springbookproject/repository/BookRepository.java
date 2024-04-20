package com.bookstore.springbookproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.springbookproject.entity.Book;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContaining(String title);
    Page<Book> findAll(Pageable pageable);
    List<Book> findByCategory_Name(String categoryName);
}
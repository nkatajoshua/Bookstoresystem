package com.bookstore.springbookproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.springbookproject.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}

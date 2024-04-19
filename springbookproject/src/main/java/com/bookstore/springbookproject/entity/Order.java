package com.bookstore.springbookproject.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private User user;
    
    @ManyToMany
    private List<Book> books;
    
    @SuppressWarnings("unused")
    private LocalDateTime createdAt;

    public void setCreatedAt(LocalDateTime now) {
        throw new UnsupportedOperationException("Unimplemented method 'setCreatedAt'");
    }
    
    // getters and setters
}

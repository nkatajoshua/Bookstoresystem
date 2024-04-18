package com.bookstore.springbookproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getCountry() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getCountry'");
    }

    public void setCountry(Object country) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setCountry'");
    }
}
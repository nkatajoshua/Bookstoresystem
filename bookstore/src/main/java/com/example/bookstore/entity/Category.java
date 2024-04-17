package com.example.bookstore.entity;

import javax.persistence.*;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Object getName() {
        return null;
    }

    public void setName(Object name) {
    }

    // constructors, getters, and setters

    // getters and setters
}

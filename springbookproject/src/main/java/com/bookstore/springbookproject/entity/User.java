package com.bookstore.springbookproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank
    private String username;
    
    @NotBlank
    private String password;

    public static Object builder() {
        throw new UnsupportedOperationException("Unimplemented method 'builder'");
    }
    
    // other user details and getters/setters
}
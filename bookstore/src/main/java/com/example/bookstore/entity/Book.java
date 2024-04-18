package com.example.bookstore.entity;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id") // Define the column name for the foreign key
    private Author author;

    @ManyToOne
    @JoinColumn(name = "category_id") // Define the column name for the foreign key
    private Category category;

    // Constructors
    public Book() {
        // Default constructor
    }

    public Book(String title, Author author, Category category) {
        this.title = title;
        this.author = author;
        this.category = category;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

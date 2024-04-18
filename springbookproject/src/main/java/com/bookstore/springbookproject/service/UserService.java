package com.bookstore.springbookproject.service;

import com.bookstore.springbookproject.model.User;

public interface UserService {
    User findByUsername(String username);
}

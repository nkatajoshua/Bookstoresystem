package com.bookstore.springbookproject.service.impl;

import com.bookstore.springbookproject.model.User;
import com.bookstore.springbookproject.repository.UserRepository;
import com.bookstore.springbookproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}

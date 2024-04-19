package com.bookstore.springbookproject.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.springbookproject.entity.Order;
import com.bookstore.springbookproject.repository.OrderRepository;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;
    
    public Order createOrder(Order order) {
        order.setCreatedAt(LocalDateTime.now());
        return orderRepository.save(order);
    }
    
    // other methods for order management
}
package com.bookstore.springbookproject.service;

import com.bookstore.springbookproject.entity.Order;

public interface OrderService {
    
    Order createOrder(Order order);
    
    // Define other methods for order management (e.g., findById, deleteById, updateOrder, etc.)
}

package com.onlineshop.onlineshop.Services;

import com.onlineshop.onlineshop.Models.Order;
import com.onlineshop.onlineshop.Models.User;
import com.onlineshop.onlineshop.Repositories.OrderRepository;
import com.onlineshop.onlineshop.Repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void create(Order order){
        return;
    }

    public Order getById(int id){
        return null;
    }

    public List<Order> getByUserId(int userId){
        return null;
    }
}

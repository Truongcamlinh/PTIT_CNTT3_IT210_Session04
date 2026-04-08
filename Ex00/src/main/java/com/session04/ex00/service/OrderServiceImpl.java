package com.session04.ex00.service;

import com.session04.ex00.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<String> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public String getWelcomeMessage() {
        return "Spring MVC (non-Boot) is running on Tomcat.";
    }
}


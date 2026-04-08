package com.session04.ex00.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InMemoryOrderRepository implements OrderRepository {

    @Override
    public List<String> findAll() {
        return List.of(
                "Pho bo",
                "Banh mi",
                "Tra dao"
        );
    }
}


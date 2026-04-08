package com.session04.ex01.service;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

    public String getAllOrders() {
        return "Danh sach toan bo don hang";
    }

    public String getOrderById(Long id) {
        return "Thong tin don hang voi ID: " + id;
    }

    public String addOrder(String itemName) {
        return "Da them mon moi: " + itemName;
    }
}


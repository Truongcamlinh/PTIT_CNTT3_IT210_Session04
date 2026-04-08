package com.session04.ex03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bai3/orders")
public class OrderController {
    @GetMapping("/{id}")
    @ResponseBody
    public String getOrderDetail(@PathVariable("id") int id) {
        return "Chi tiết đơn hàng số " + id;
    }
}

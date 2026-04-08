package com.session04.ex00.controller;

import com.session04.ex00.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LegacyController {
    private final OrderService orderService;

    public LegacyController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", orderService.getWelcomeMessage());
        model.addAttribute("orders", orderService.getAllOrders());
        return "home";
    }

    @GetMapping("/legacy")
    public String legacy(Model model) {
        model.addAttribute("message", "Legacy page served by DispatcherServlet");
        return "legacy";
    }
}


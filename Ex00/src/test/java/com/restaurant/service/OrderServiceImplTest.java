package com.restaurant.service;

import com.session04.ex00.repository.OrderRepository;
import com.session04.ex00.service.OrderService;
import com.session04.ex00.service.OrderServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class OrderServiceImplTest {

    @Test
    void shouldReturnOrdersFromRepository() {
        OrderRepository repository = () -> List.of("A", "B");
        OrderService service = new OrderServiceImpl(repository);

        List<String> orders = service.getAllOrders();

        assertEquals(2, orders.size());
        assertFalse(orders.isEmpty());
    }
}


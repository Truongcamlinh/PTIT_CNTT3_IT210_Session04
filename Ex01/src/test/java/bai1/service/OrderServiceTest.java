package bai1.service;

import com.session04.ex01.service.OrderRepository;
import com.session04.ex01.service.OrderService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderServiceTest {

    private final OrderService orderService = new OrderService(new OrderRepository());

    @Test
    void getAllOrdersReturnsExpectedMessage() {
        assertEquals("Danh sach toan bo don hang", orderService.getAllOrders());
    }

    @Test
    void getOrderByIdReturnsExpectedMessage() {
        assertEquals("Thong tin don hang voi ID: 99", orderService.getOrderById(99L));
    }

    @Test
    void addOrderReturnsExpectedMessage() {
        assertEquals("Da them mon moi: com ga", orderService.addOrder("com ga"));
    }
}


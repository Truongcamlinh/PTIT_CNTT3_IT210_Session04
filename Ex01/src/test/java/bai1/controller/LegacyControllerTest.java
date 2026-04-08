package bai1.controller;

import com.session04.ex01.controller.LegacyController;
import com.session04.ex01.service.OrderRepository;
import com.session04.ex01.service.OrderService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LegacyControllerTest {

    private final LegacyController controller = new LegacyController(new OrderService(new OrderRepository()));

    @Test
    void getAllOrdersDelegatesToService() {
        assertEquals("Danh sach toan bo don hang", controller.getAllOrders());
    }

    @Test
    void getOrderByIdDelegatesToService() {
        assertEquals("Thong tin don hang voi ID: 7", controller.getOrderById(7L));
    }

    @Test
    void addNewOrderDelegatesToService() {
        assertEquals("Da them mon moi: bun bo", controller.addNewOrder("bun bo"));
    }
}


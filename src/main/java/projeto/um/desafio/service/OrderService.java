package projeto.um.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.um.desafio.model.Order;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double calculateTotal(Order order) {
        double discount = order.getBasicValue() * (order.getDiscountPercentage() / 100);
        double valueAfterDiscount = order.getBasicValue() - discount;
        double shipping = shippingService.calculateShipping(order.getBasicValue());
        return valueAfterDiscount + shipping;
    }
}

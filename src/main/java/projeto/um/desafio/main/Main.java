package projeto.um.desafio.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import projeto.um.desafio.model.Order;
import projeto.um.desafio.service.OrderService;

@Component
public class Main implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    @Override
    public void run(String... args) throws Exception {
        Order order1 = new Order(1034, 150.00, 20.0);
        Order order2 = new Order(2282, 800.00, 10.0);
        Order order3 = new Order(1309, 95.90, 0.0);

        System.out.println("Pedido código " + order1.getCode() + " Valor total: R$ " + orderService.calculateTotal(order1));
        System.out.println("Pedido código " + order2.getCode() + " Valor total: R$ " + orderService.calculateTotal(order2));
        System.out.println("Pedido código " + order3.getCode() + " Valor total: R$ " + orderService.calculateTotal(order3));
    }
}

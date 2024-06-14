package projeto.um.desafio.service;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double calculateShipping(double basicValue) {
        if (basicValue < 100.0) {
            return 20.0;
        } else if (basicValue < 200.0) {
            return 12.0;
        } else {
            return 0.0;
        }
    }
}

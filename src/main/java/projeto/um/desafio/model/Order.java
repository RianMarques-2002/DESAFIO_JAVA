package projeto.um.desafio.model;

public class Order {
    private int code;
    private double basicValue;
    private double discountPercentage;

    public Order(int code, double basicValue, double discountPercentage) {
        this.code = code;
        this.basicValue = basicValue;
        this.discountPercentage = discountPercentage;
    }

    public int getCode() {
        return code;
    }

    public double getBasicValue() {
        return basicValue;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }
}

package br.cesul.ex01;

public abstract class Product {

    private final String name;
    protected Double price;
    protected Double quantity;
    protected final Double additionalTransport;

    public Product(String name, Double price, Double quantity, Double additionalTransport) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.additionalTransport = additionalTransport;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double getQuantity() {
        return quantity;
    }

    public Double getAdditionalTransport() {
        return additionalTransport;
    }

    public abstract Double getFinalPrice();
}

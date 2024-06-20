package br.cesul.ex01;

public class AgriculturalProduct extends Product {

    public AgriculturalProduct(String name, Double price, Double quantity, Double additionalTransport) {
        super(name, price, quantity, additionalTransport);
    }

    @Override
    public Double getFinalPrice() {
        if (quantity > 0 && quantity <= 100) {
            return ((quantity * price) * 1.08 + (quantity * additionalTransport));
        } else if (quantity >= 100.01 && quantity <= 200) {
            return ((quantity * price) * 1.05 + (quantity * additionalTransport));
        } else {
            return ((quantity * price) * 1.035 + (quantity * additionalTransport));
        }
    }

}

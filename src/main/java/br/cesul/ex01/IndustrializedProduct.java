package br.cesul.ex01;

public class IndustrializedProduct extends Product {

    private final Double icms;
    private final Double ipi;

    public IndustrializedProduct(String name, Double price, Double quantity, Double additionalTransport, Double icms, Double ipi) {
        super(name, price, quantity, additionalTransport);
        this.icms = icms;
        this.ipi = ipi;
    }

    @Override
    public Double getFinalPrice() {

        if (quantity > 0 && quantity <= 50) {
            return ((quantity * price) * 1.12 * icms * ipi + (quantity * additionalTransport));
        } else if (quantity >= 51 && quantity <= 200) {
            return ((quantity * price) * 1.105 * icms * ipi + (quantity * additionalTransport));
        } else {
            return ((quantity * price) * 1.09 * icms * ipi + (quantity * additionalTransport));
        }
    }

    public Double getIcms() {
        return icms;
    }

    public Double getIpi() {
        return ipi;
    }
}
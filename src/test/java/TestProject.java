import br.cesul.ex01.AgriculturalProduct;
import br.cesul.ex01.IndustrializedProduct;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProject {

    @Test
    @DisplayName("Teste para os produtos Industrializados com 25 de quantidade")
    public void TestIndustrializedProduct25() {
        var industrializedProduct25 = new IndustrializedProduct("Chapa", 25.0, 3d, 0.35, 1.12, 1.05);

        assertEquals(99.834, industrializedProduct25.getFinalPrice(), 0.01);
    }

    @Test
    @DisplayName("Teste para os produtos Industrializados com 150 quantidade")
    public void TestIndustrializedProduct150() {
        var industrializedProduct150 = new IndustrializedProduct("Colher", 5d, 150d, 0.30, 1.12, 1.05);

        assertEquals(1019.61, industrializedProduct150.getFinalPrice(), 0.01);
    }

    @Test
    @DisplayName("Teste para os produtos Industrializados com 250 quantidade")
    public void TestIndustrializedProduct250() {
        var industrializedProduct250 = new IndustrializedProduct("Máscara", 2.5d, 250d, 0.25, 1.12, 1.05);

        assertEquals(863.65, industrializedProduct250.getFinalPrice(), 0.01);
    }

    @Test
    @DisplayName("Teste para os produtos Agrícola com quantidade 3")
    public void TestAgriculturalProduct3() {
        var agriculturalProduct = new AgriculturalProduct("Laranja", 3.45, 3d, 0.10);

        assertEquals(11.478, agriculturalProduct.getFinalPrice(), 0.01);

    }

    @Test
    @DisplayName("Teste para os produtos Agrícola com quantidade 101")
    public void TestAgriculturalProduct101() {
        var agriculturalProduct = new AgriculturalProduct("Abacate", 20.0, 100.01, 0.08);

        assertEquals(2108.2108, agriculturalProduct.getFinalPrice(), 0.01);
    }

    @Test
    @DisplayName("Teste para os produtos Agrícola com quantidade 734")
    public void TestAgriculturalProduct250() {
        var agriculturalProduct = new AgriculturalProduct("Melancia", 1.99, 734.0, 0.05);

        assertEquals(1548.4831, agriculturalProduct.getFinalPrice(), 0.01);
    }




}
package test.java;

import main.domain.impl.Product;
import main.handler.PromotionHandler;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class PromotionHandlerTest {
    private PromotionHandler promotionHandler;

    @Test
    public void testProductPriceWithoutPromotionScenarioOne() {
        List<String> products = Arrays.asList("A", "A", "A");
        Product product = new Product(products);
        promotionHandler = new PromotionHandler();
        BigDecimal finalPriceOfTheProduct = promotionHandler.totalPrice(product);
        Assert.assertEquals(finalPriceOfTheProduct, BigDecimal.valueOf(130));
    }

    @Test
    public void testProductPriceWithPromotionScenarioTwo() {
        List<String> products = Arrays.asList("A", "A", "A", "B", "B", "C", "A", "B", "A", "B", "B");
        Product product = new Product(products);
        promotionHandler = new PromotionHandler();
        BigDecimal finalPriceOfTheProduct = promotionHandler.totalPrice(product);
        Assert.assertEquals(finalPriceOfTheProduct, BigDecimal.valueOf(370));
    }

    @Test
    public void testProductPriceWithPromotionScenarioThree() {
        List<String> products = Arrays.asList("A", "A", "A", "B", "B", "C", "D", "B", "B", "B");
        Product product = new Product(products);
        promotionHandler = new PromotionHandler();
        BigDecimal finalPriceOfTheProduct = promotionHandler.totalPrice(product);
        Assert.assertEquals(finalPriceOfTheProduct, BigDecimal.valueOf(280));
    }
}

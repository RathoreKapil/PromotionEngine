package main.promotions;

import main.domain.impl.Product;

import java.math.BigDecimal;

public interface PromotionInterface {
    String C = "C";
    String D = "D";
    String B = "B";
    String A = "A";

    BigDecimal getTotalPriceOfProduct(Product products);
}

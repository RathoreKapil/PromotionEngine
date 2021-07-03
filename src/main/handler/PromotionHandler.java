package main.handler;

import main.domain.impl.Product;
import main.promotions.impl.PromotionOne;
import main.promotions.impl.PromotionTwo;

import java.math.BigDecimal;
import java.math.BigInteger;

public class PromotionHandler {
    public BigDecimal totalPrice(Product product) {
        PromotionOne promotionOne = new PromotionOne();
        PromotionTwo promotionTwo = new PromotionTwo();
        BigDecimal finalPrice = new BigDecimal(BigInteger.ZERO);
        BigDecimal priceAfterPromotionOne = promotionOne.getTotalPriceOfProduct(product);
        BigDecimal priceAfterPromotionTwo = promotionTwo.getTotalPriceOfProduct(product);
        finalPrice = priceAfterPromotionOne.add(priceAfterPromotionTwo);
        return finalPrice;
    }
}

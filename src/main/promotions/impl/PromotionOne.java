package main.promotions.impl;

import main.domain.impl.Product;
import main.promotions.PromotionInterface;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class PromotionOne implements PromotionInterface {
    @Override
    public BigDecimal getTotalPriceOfProduct(Product products) {
        long countA = 0;
        long countB = 0;
        BigDecimal finalPriceOfA = new BigDecimal(BigInteger.ZERO);
        BigDecimal finalPriceOfB = new BigDecimal(BigInteger.ZERO);

        Map<String, BigDecimal> priceSet = new HashMap<>();
        priceSet = products.getPrice();
        for (String productName : products.getListOfProducts()) {
            if (productName.equalsIgnoreCase(A)) {
                countA++;
            } else if (productName.equalsIgnoreCase(B)) {
                countB++;
            }
        }
        if (countA > 0) {
            finalPriceOfA = BigDecimal.valueOf((countA / 3) * 130).add(BigDecimal.valueOf(countA % 3).multiply(priceSet.get(A)));
        }
        if (countB > 0) {
            finalPriceOfB = BigDecimal.valueOf((countB / 2) * 45).add(BigDecimal.valueOf(countB % 2).multiply(priceSet.get(B)));
        }
        BigDecimal finalPriceOfProductAandB = finalPriceOfA.add(finalPriceOfB);
        return finalPriceOfProductAandB;
    }
}

package main.promotions.impl;

import main.domain.impl.Product;
import main.promotions.PromotionInterface;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class PromotionTwo implements PromotionInterface {
    @Override
    public BigDecimal getTotalPriceOfProduct(Product products) {
        long countC = 0;
        long countD = 0;
        BigDecimal finalPriceOfCandD = new BigDecimal(BigInteger.ZERO);

        Map<String, BigDecimal> priceSet = new HashMap<>();
        priceSet = products.getPrice();
        for (String productName : products.getListOfProducts())
            if (productName.equalsIgnoreCase(C)) {
                countC++;
            } else if (productName.equalsIgnoreCase(D)) {
                countD++;
            }

        if ((countC > 0 || countD > 0)) {
            if ((countC - countD) == 0) {
                finalPriceOfCandD = BigDecimal.valueOf((countC % 2) * 30);
            } else if (countC > countD) {
                finalPriceOfCandD = BigDecimal.valueOf(countC - countD).multiply(priceSet.get(C)).add(BigDecimal.valueOf(countD * 30));
            } else if (countC < countD) {
                finalPriceOfCandD = BigDecimal.valueOf(countD - countC).multiply(priceSet.get(D)).add(BigDecimal.valueOf(countC * 30));
            } else {
                finalPriceOfCandD = (BigDecimal.valueOf(countC).multiply(priceSet.get(C)))
                        .add(BigDecimal.valueOf(countD).multiply(priceSet.get(D)));
            }
        }

        return finalPriceOfCandD;
    }
}

package main.domain;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public interface ProductInterface {
    Map<String, BigDecimal> priceSet = new HashMap<>();

    default Map<String, BigDecimal> getPrice() {
        priceSet.put("A", BigDecimal.valueOf(50));
        priceSet.put("B", BigDecimal.valueOf(30));
        priceSet.put("C", BigDecimal.valueOf(20));
        priceSet.put("D", BigDecimal.valueOf(15));
        return priceSet;
    }
}

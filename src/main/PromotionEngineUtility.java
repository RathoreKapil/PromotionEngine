package main;

import main.domain.impl.Product;
import main.handler.PromotionHandler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Promotion Engine Utility*
 * Takes user's number of products and the sku ids for the product
 * applies the promotion and return final price after applying promtions
 **/

public class PromotionEngineUtility {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            List<String> products = new ArrayList<>();
            System.out.println("How many products you would like to enter: ");
            int totalItems = Integer.parseInt(br.readLine());
            while (totalItems > 0) {
                System.out.println("Enter the product ID: ");
                String skuId = br.readLine();
                products.add(skuId);
                totalItems--;
            }
            Product product = new Product(products);
            PromotionHandler promotionHandler = new PromotionHandler();
            BigDecimal finalPriceOfPurchase = promotionHandler.totalPrice(product);
            System.out.println(finalPriceOfPurchase);
        } catch (NumberFormatException nfe) {
            System.out.println("Wrong number was entered, exiting the process");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

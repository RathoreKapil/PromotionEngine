package main.domain.impl;

import main.domain.ProductInterface;

import java.util.List;

public class Product implements ProductInterface {
    private List<String> listOfProducts;


    public Product(List<String> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public List<String> getListOfProducts() {
        return listOfProducts;
    }

}

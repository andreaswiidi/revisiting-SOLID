package org.example.service;

import org.example.models.IProducts;

import java.util.ArrayList;
import java.util.List;

//this class will handle the core business logic related to products.

public class ProductCatalog {
    private List<IProducts> products;

    public ProductCatalog() {
        this.products = new ArrayList<>(); // If using a list
    }

    public void getProducts() {
        for (IProducts prducts : products){
            prducts.printProduct();
        }
    }

    public void addProduct(IProducts product) {
        products.add(product);
    }

    public IProducts getProduct(String name) {
        for (IProducts product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void removeProduct(String name) {
        products.removeIf(product -> product.getName().equals(name));
    }

    public List<IProducts> listProducts() {
        return products;
    }
}

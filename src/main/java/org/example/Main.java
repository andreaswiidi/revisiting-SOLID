package org.example;

import org.example.models.*;
import org.example.service.ProductCatalog;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //add the category
        ICategory foodCategory = new GroceryCategory("Food");
        ICategory drinkCategory = new GroceryCategory("Drink");

        //add the products catalog
        List<IProducts> products = new ArrayList<>();
        IProducts meat = new Meat("Wagyu", 10.99, "Wagyu", foodCategory, "AA");
        IProducts snack = new Snack("Cheese Stick", 6.99, "Cheese Stick", foodCategory,  LocalDate.of(2025, 11, 1));
        IProducts milk = new Snack("Milk", 5.99, "Milk", drinkCategory,  LocalDate.of(2024, 11, 1));

        //add the product to product service
        ProductCatalog productService = new ProductCatalog();
        productService.addProduct(meat);
        productService.addProduct(snack);
        productService.addProduct(milk);

        productService.getProducts();
    }
}
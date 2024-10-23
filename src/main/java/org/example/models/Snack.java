package org.example.models;

import java.time.LocalDate;

public class Snack extends AbstractProduct{
    private LocalDate expirationDate;

    public Snack(String name, double price, String description, ICategory category, LocalDate expirationDate) {
        super(name, price, description, category);
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public void printProduct() {
        System.out.println("Product Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Category: " + getCategory());
        System.out.println("Expired: " + getExpirationDate());
        System.out.println("---------------------------");
    }
}

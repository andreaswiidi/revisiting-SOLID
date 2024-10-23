package org.example.models;


// The purpose of this class is to become a blueprint for other classes
// S -> responsible for managing the common properties
// O -> open for extension (through subclasses like BookProduct and FoodProduct), but it’s closed for modification.
//      You don’t need to modify AbstractProduct each time a new product type is added
// L -> Subclasses (BookProduct, FoodProduct) can replace the AbstractProduct in any context

public abstract class AbstractProduct implements IProducts{
    protected String name;
    protected double price;
    protected String description;
    protected ICategory category;

    public AbstractProduct(String name, double price, String description, ICategory category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getCategory() {
        return category.getCategoryName();
    }

    // because this function is in the contract (interface) but,
    // I want the subclass handle it, so I make it abstract
    @Override
    public abstract void printProduct();
}

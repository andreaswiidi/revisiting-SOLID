package org.example.models;

public class GroceryCategory implements ICategory {
    private String categoryName;

    public GroceryCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String getCategoryName() {
        return categoryName;
    }
}

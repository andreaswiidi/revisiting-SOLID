package org.example.models;

//What this interface class implements from SOLID
// I -> no class should be forced to implement methods it doesn't use
// D -> High-level modules should depend on abstractions, not on concrete classes.
//      Because we will create a ProductCatalogService that will handle the core logic

public interface IProducts {
    String getName();
    double getPrice();
    String getDescription();
    String getCategory();
    void printProduct();
}

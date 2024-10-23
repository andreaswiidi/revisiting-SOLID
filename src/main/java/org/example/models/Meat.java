package org.example.models;

// The SOLID of this class
// S -> meat.
// O -> extends the abstract

public class Meat extends AbstractProduct{
    private String grade;

    public Meat(String name, double price, String description, ICategory category, String grade) {
        super(name, price, description, category);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public void printProduct() {
        System.out.println("Product Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Category: " + getCategory());
        System.out.println("Grade: " + getGrade());
        System.out.println("---------------------------");
    }
}

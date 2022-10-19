
package ru.mirea.task3.third;

public class Circle { // Save as "Circle.java"
    // Private variables
    private double radius;
    private String color;
    public Circle() { // 1st Constructor
        radius = 1.0;
        color = "rainbow";
    }
    public Circle(double r) { // 2nd Constructor
        radius = r;
        color = "rainbow";
    }
    public Circle(double r, String abc) { // 3rd Constructor
        radius = r;
        color = abc;
    }

    // Public methods
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
}

package org.example.Shapes;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("drawing circle");
    }

    @Override
    public void computeArea() {
        System.out.println("area is pie multiplied by square of radius");
    }
}

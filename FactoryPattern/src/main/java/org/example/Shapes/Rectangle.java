package org.example.Shapes;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }

    @Override
    public void computeArea() {
        System.out.println("area is length multipled by width");
    }
}

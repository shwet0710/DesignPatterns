package org.example;

import org.example.Factory.CircleCreator;
import org.example.Factory.ShapeFactory;
import org.example.Shapes.Shape;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape shape = Manager.getShapeFactory(ShapeType.CIRCLE);
        shape.draw();
        shape.computeArea();
    }
}
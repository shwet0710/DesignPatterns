package org.example;

import org.example.Factory.CircleCreator;
import org.example.Factory.RectangleCreator;
import org.example.Factory.ShapeFactory;
import org.example.Shapes.Shape;

public class Manager {
    public static Shape getShapeFactory(ShapeType shape) {
        Shape shape1 = null;
        switch (shape){
            case CIRCLE:
                ShapeFactory s1 = new CircleCreator();
                shape1 = s1.createShape();
                break;
            case RECTANGLE:
                ShapeFactory s2 = new RectangleCreator();
                shape1 = s2.createShape();
                break;
            default:
                shape1 = null;
                break;
        }
        return shape1;
    }
}

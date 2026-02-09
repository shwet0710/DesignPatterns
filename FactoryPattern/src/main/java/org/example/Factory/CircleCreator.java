package org.example.Factory;

import org.example.Shapes.Circle;
import org.example.Shapes.Shape;

public class CircleCreator extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}

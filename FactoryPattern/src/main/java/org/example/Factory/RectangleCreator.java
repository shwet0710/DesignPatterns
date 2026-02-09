package org.example.Factory;

import org.example.Shapes.Rectangle;
import org.example.Shapes.Shape;

public class RectangleCreator extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}

package hw3.Factory;

import hw3.Factory.interfaces.Shape;
import hw3.Factory.shapes.Circle;
import hw3.Factory.shapes.Rectangle;
import hw3.Factory.shapes.Triangle;

public class ShapeFactory {
    public Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle();
        } else {
            throw new IllegalArgumentException("Invalid shape type");
        }
    }
}

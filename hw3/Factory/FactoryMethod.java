package hw3.Factory;

import hw3.Factory.interfaces.Shape;

public class FactoryMethod {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.createShape("circle");
        circle.draw();

        Shape rectangle = shapeFactory.createShape("rectangle");
        rectangle.draw();

        Shape triangle = shapeFactory.createShape("triangle");
        triangle.draw();
    }
}

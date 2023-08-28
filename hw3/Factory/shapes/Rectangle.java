package hw3.Factory.shapes;

import hw3.Factory.interfaces.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

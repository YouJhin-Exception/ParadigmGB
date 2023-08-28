package hw3.Factory.shapes;

import hw3.Factory.interfaces.Shape;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

package hw3.Decorator.ingredients;

import hw3.Decorator.interfaces.Coffee;

public class JustCoffee implements Coffee {
    @Override
    public double cost() {
        return 3.0;
    }
}

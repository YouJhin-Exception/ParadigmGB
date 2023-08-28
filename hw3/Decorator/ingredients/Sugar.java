package hw3.Decorator.ingredients;

import hw3.Decorator.abstracts.CoffeeDecorator;
import hw3.Decorator.interfaces.Coffee;

public class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double cost() {
        return super.cost() + 0.5;
    }
}

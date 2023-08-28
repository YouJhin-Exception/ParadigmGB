package hw3.Decorator;

import hw3.Decorator.ingredients.JustCoffee;
import hw3.Decorator.ingredients.Milk;
import hw3.Decorator.ingredients.Sugar;
import hw3.Decorator.interfaces.Coffee;

public class DecoratorDemo {
    public static void main(String[] args) {
        Coffee coffee = new JustCoffee();
        Coffee coffeeWithSugar = new Sugar(coffee);
        Coffee coffeeWithSugarAndMilk = new Milk(coffeeWithSugar);

        System.out.println("Total cost: " + coffeeWithSugarAndMilk.cost());
    }
}

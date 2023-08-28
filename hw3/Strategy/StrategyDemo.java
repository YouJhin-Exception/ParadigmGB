package hw3.Strategy;

import hw3.Strategy.sorts.BubbleSort;
import hw3.Strategy.sorts.SelectionSort;

public class StrategyDemo {
    public static void main(String[] args) {
        int[] numbers = {34, 91, 2, 7, 12, 15, 1, 24};

        SortContext context = new SortContext();

        context.setStrategy(new BubbleSort());
        context.sortNumbers(numbers);

        context.setStrategy(new SelectionSort());
        context.sortNumbers(numbers);
    }
}

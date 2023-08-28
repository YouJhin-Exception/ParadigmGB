package hw3.Strategy;

import hw3.Strategy.interfaces.SortStrategy;

import java.util.Arrays;

public class SortContext {
    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortNumbers(int[] numbers) {
        strategy.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

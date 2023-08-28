package hw3.Strategy.sorts;

import hw3.Strategy.interfaces.SortStrategy;

public class SelectionSort implements SortStrategy {
    @Override
    public void sort(int[] numbers) {

        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }

    }
}

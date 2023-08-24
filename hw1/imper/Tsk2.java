package hw1.imper;

import java.util.ArrayList;
import java.util.List;

public class Tsk2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(1);
        numbers.add(8);
        numbers.add(3);

        int min = findMinimum(numbers);
        System.out.println("Наименьшее число: " + min);
    }

    public static int findMinimum(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Список чисел не может быть пустым.");
        }

        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }

        return min;
    }
}

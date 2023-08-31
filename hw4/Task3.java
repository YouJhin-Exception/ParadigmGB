package hw4;

import java.util.List;
import java.util.function.BinaryOperator;

/*
Функция-редуктор: Напишите функцию-редуктор (или функцию свертки), которая принимает начальное значение и список чисел,
а затем возвращает произведение всех чисел в списке. Используйте эту функцию для вычисления произведения чисел в списке.
 */
public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 4, 5);
        int initialValue = 1;
        int product = reduce(numbers, initialValue, (acc, num) -> acc * num);
        System.out.println("Product: " + product); // Вывод: Product: 120
    }

    // Функция-редуктор
    public static <T> T reduce(List<T> list, T initialValue, BinaryOperator<T> accumulator) {
        T result = initialValue;
        for (T element : list) {
            result = accumulator.apply(result, element);
        }
        return result;
    }
}

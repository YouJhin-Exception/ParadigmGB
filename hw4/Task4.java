package hw4;

import java.util.function.Function;

/*
Замыкание: Создайте функцию, которая принимает некоторое число n и возвращает функцию,
которая прибавляет n к своему аргументу. Продемонстрируйте использование этой функции-замыкания.
 */
public class Task4 {
    public static void main(String[] args) {
        int n = 5;
        Function<Integer, Integer> closure = createClosure(n);

        int result1 = closure.apply(10); // Результат: 10 + 5 = 15
        int result2 = closure.apply(20); // Результат: 20 + 5 = 25

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }

    // Функция для создания замыкания
    public static Function<Integer, Integer> createClosure(int n) {
        // Возвращаемая функция является замыканием, так как она захватывает переменную n из окружающей области
        return x -> x + n;
    }
}

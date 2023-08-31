package hw4;

import java.util.List;

/*
Функции-редуцеры для списков: Напишите функцию-редуктор, которая принимает список строк и возвращает строку,
состоящую из объединенных элементов списка через запятую.
Например, для списка ["apple", "banana", "cherry"] результат должен быть "apple, banana, cherry".
 */
public class Task5 {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "cherry");
        String result = reduceToString(fruits);
        System.out.println("Result: " + result); // Вывод: Result: apple, banana, cherry
    }

    // Функция-редуктор для объединения элементов списка строк через запятую
    public static String reduceToString(List<String> list) {
        return String.join(", ", list);
    }
}


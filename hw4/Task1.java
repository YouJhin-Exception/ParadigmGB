package hw4;
/*
Рекурсивная сумма: Напишите рекурсивную функцию, которая вычисляет сумму всех чисел от 1 до n.
Например, для n = 5 результат должен быть 1 + 2 + 3 + 4 + 5 = 15.
 */
public class Task1 {
    public static void main(String[] args) {
        int n = 5;
        int sum = calculateSum(n);
        System.out.println("Sum of numbers from 1 to " + n + ": " + sum); // Вывод: Sum of numbers from 1 to 5: 15
    }

    // Рекурсивная функция для вычисления суммы чисел от 1 до n
    public static int calculateSum(int n) {
        if (n <= 0) {
            return 0; // Базовый случай: сумма чисел от 1 до 0 равна 0
        } else {
            return n + calculateSum(n - 1); // Рекурсивный случай: сумма чисел от 1 до n равна n + сумма чисел от 1 до n-1
        }
    }

}

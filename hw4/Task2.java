package hw4;
/*
Фибоначчи через рекурсию: Напишите рекурсивную функцию для вычисления числа Фибоначчи с индексом n.
 Напоминаю, что последовательность Фибоначчи определяется как: F(0) = 0, F(1) = 1 и F(n) = F(n-1) + F(n-2) для n > 1.
 */
public class Task2 {
    public static void main(String[] args) {
        int n = 6;
        int fibonacciNumber = calculateFibonacci(n);
        System.out.println("Fibonacci number at index " + n + ": " + fibonacciNumber); // Вывод: Fibonacci number at index 6: 8
    }

    // Рекурсивная функция для вычисления числа Фибоначчи с индексом n
    public static int calculateFibonacci(int n) {
        if (n <= 0) {
            return 0; // Базовый случай: F(0) = 0
        } else if (n == 1) {
            return 1; // Базовый случай: F(1) = 1
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2); // Рекурсивный случай: F(n) = F(n-1) + F(n-2)
        }
    }
}

package hw1.imper;

import java.util.Scanner;

public class Tsk1 {
    public static void main(String[] args) {

        // Запросить у пользователя число N
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        int sum = 0;

        // Проход по всем числам от 1 до N
        for (int i = 1; i <= N; i++) {
            // Проверить, является ли число четным
            if (i % 2 == 0) {
                sum = sum + i; // Добавить текущее четное число к сумме
            }
        }

        // Вывести результат
        System.out.println("Сумма всех четных чисел в диапазоне от 1 до " + N + ": " + sum);
    }
}


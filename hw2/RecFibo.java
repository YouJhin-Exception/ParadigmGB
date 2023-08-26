package hw2;

/*Написать функцию, которая возвращает n-тое число Фибоначчи.
Почему это процедурное программирование: Здесь мы можем использовать рекурсивную процедуру, где каждый вызов функции делает два дополнительных вызова (для n-1 и n-2).
Хотя это не самый эффективный способ решения, он хорошо демонстрирует концепцию процедурного программирования.
*/
public class RecFibo {
    public static int recursiveFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int result = recursiveFibonacci(n);
        System.out.println("Fibonacci number at position " + n + " : " + result);
    }

}

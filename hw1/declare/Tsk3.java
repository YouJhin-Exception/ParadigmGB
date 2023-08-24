package hw1.declare;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Tsk3 {

    //#1
    public static BigInteger factorial(BigInteger number) {
        BigInteger result = BigInteger.valueOf(1);

        for (long factor = 2; factor <= number.longValue(); factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }

        return result;
    }

    //#2

    public static long calculateFactorial(int number) {
        return LongStream.rangeClosed(1, number)
                .reduce(1, (long a, long b) -> a * b);
    }

    public static void main(String[] args) {
        System.out.println("Факториал числа 5 в методе #1 = "+factorial(BigInteger.valueOf(5)));
        System.out.println("Факториал числа 6 в методе #2 = "+calculateFactorial(6));
    }
}

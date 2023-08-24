package hw1.declare;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tsk4 {
    public static List<Integer> filterUniqueElements(List<Integer> numbers) {
    return numbers.stream()
            .distinct()
            .collect(Collectors.toList());
}
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(4);

        List<Integer> uniqueNumbers = filterUniqueElements(numbers);
        System.out.println("Уникальные элементы: " + uniqueNumbers);
    }


}

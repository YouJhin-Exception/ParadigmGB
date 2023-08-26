package hw2;

import java.util.ArrayList;
import java.util.List;
// Имеется массив чисел. Необходимо разбить его на подмассивы так, чтобы сумма чисел в каждом подмассиве была меньше или равна заданному значению X.
public class SubArray {
    public static List<List<Integer>> partitionIntoSubArrays(int[] arr, int X) {
        List<List<Integer>> subarrayList = new ArrayList<>();
        List<Integer> currentSubarray = new ArrayList<>();
        int currentSum = 0;

        for (int num : arr) {
            if (currentSum + num <= X) {
                currentSubarray.add(num);
                currentSum += num;
            } else {
                subarrayList.add(currentSubarray);
                currentSubarray = new ArrayList<>();
                currentSubarray.add(num);
                currentSum = num;
            }
        }

        if (!currentSubarray.isEmpty()) {
            subarrayList.add(currentSubarray);
        }

        return subarrayList;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int X = 12;
        List<List<Integer>> result = partitionIntoSubArrays(array, X);
        System.out.println(result);
    }
}


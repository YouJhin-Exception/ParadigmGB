package hw6;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 77;

        int result = binarySearch(array, target);

        if (result != -1) {
            System.out.println("Искомый элемент " + target + " найден по индексу " + result);
        } else {
            System.out.println("Искомый элемент " + target + " не найден в массиве.");
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Элемент найден, возвращаем его индекс
            }

            if (array[mid] < target) {
                left = mid + 1; // Искать справа от mid
            } else {
                right = mid - 1; // Искать слева от mid
            }
        }

        return -1; // Элемент не найден
    }
}

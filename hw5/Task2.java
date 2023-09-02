package hw5;
import java.util.Arrays;

//Сортировка слиянием
public class Task2 {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Находим средний индекс
            int middle = (left + right) / 2;

            // Сортируем левую и правую половины
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Объединяем две отсортированные половины
            merge(arr, left, middle, right);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Копируем данные во временные массивы leftArray[] и rightArray[]
        System.arraycopy(arr, left, leftArray, 0, n1);
        for (int i = 0; i < n2; i++) {
            rightArray[i] = arr[middle + 1 + i];
        }

        // Объединяем временные массивы обратно в основной массив arr[left...right]
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Копируем оставшиеся элементы leftArray[], если они есть
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Копируем оставшиеся элементы rightArray[], если они есть
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

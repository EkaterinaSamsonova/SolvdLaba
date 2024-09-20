//Sorting algorithm implementation
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] intArray = new int[]{2, 3, 1, 5, 6, 4, 8, 10, 9, 0};
        int arraySize = intArray.length;

        System.out.println(Arrays.toString(intArray));

        quickSort(intArray, 0, arraySize - 1);

        System.out.println(Arrays.toString(intArray));
    }

    public static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
}


package Sorting;

import java.util.Scanner;

public class QuickSort {

    static int partition(int arr[], int low, int high)
    {
        int randomIndex = low + (int)(Math.random() * ((high - low) + 1));
        int temp = arr[high];
        arr[high] = arr[randomIndex];
        arr[randomIndex] = temp;

        int pIndex = low;
        for (int i= low; i <= high - 1; i++) {
            if (arr[i] < arr[high]) {
                temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }

        temp = arr[high];
        arr[high] = arr[pIndex];
        arr[pIndex] = temp;

        return pIndex;

    } 

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            sort(arr, low, partitionIndex - 1);
            sort(arr, partitionIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = s.nextInt();
            }

            sort(arr, 0, arr.length - 1);

            for (int i = 0; i < N; i++) {
                System.out.print(arr[i]);
            }

        }
    }
}
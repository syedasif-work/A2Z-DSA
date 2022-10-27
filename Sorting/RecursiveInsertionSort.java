package Sorting;

import java.util.Scanner;

public class RecursiveInsertionSort {

    public static void sort(int[] arr, int i) {

            if (i == arr.length) {
                return;
            }

            int j = i;
            int value = arr[i];
            while (j > 0 && arr[j-1] > value) {
                arr[j] = arr[j-1];
                j -= 1;
            }
            arr[j] = value;

            sort(arr, i+1);
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = s.nextInt();
            }

            sort(arr, 1);

            for (int i = 0; i < N; i++) {
                System.out.print(arr[i]);
            }

        }
    }
}
package Sorting;

import java.util.Scanner;

public class RecursiveBubbleSort {

    public static void sort(int[] arr, int n) {

        if (n == arr.length) {
            return;
        }

        for (int j = 0; j < arr.length - n; j++) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp; 
            }
        }

        sort(arr, n+1);
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
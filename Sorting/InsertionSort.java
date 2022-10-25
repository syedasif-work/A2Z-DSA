package Sorting;

import java.util.Scanner;

public class InsertionSort {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int value = arr[i];
            while (j > 0 && arr[j-1] > value) {
                arr[j] = arr[j-1];
                j -= 1;
            }
            System.out.println(j + "j");
            arr[j] = value;
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = s.nextInt();
            }

            sort(arr);

            for (int i = 0; i < N; i++) {
                System.out.print(arr[i]);
            }

        }
    }
}
package Sorting;

import java.util.Scanner;

public class BubbleSort {

    public static void sort(int[] arr) {
        for (int i = 1; i <= arr.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                    swap = true;
                }
            }
            if (swap == false) {
                break;
            }
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
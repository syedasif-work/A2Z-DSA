package Sorting;

import java.util.Scanner;

public class SelectionSort {

    static int select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int result = i;
        for (int j = i+1; j < arr.length; j++) {
            if (arr[j] < arr[result]) {
                result = j;
            }
        }
        return result;
	}

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = select(arr, i);
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
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
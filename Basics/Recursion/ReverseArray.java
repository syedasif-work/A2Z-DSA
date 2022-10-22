package Basics.Recursion;

import java.util.Scanner;

public class ReverseArray {

    public static void reverse(int[] arr, int start , int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
    }
    
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n ; i++){
                arr[i] = s.nextInt();
            }
            reverse(arr, 0 , arr.length - 1);
            for (int i = 0; i < n ; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}

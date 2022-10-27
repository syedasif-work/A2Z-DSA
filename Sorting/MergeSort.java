package Sorting;

import java.util.Scanner;

public class MergeSort {

    static void merge(int arr[], int l, int m, int r)
    {
        int n1 = m-l+1, n2 = r-m;
        int left[] = new int[n1];
        int right[] = new int[n2];
        
        for(int i=0; i<n1; i++)
            left[i] = arr[l+i];
        for(int i=0; i<n2; i++)
            right[i] = arr[m+1+i];
            
        int i=0, j=0, k=l;
        
        while(i<n1 && j < n2)
        {
            if(left[i] <= right[j])
                arr[k++] = left[i++];
            else 
                arr[k++] = right[j++];
        }
        
        while(i < n1)
            arr[k++] = left[i++];
        while(j < n2)
            arr[k++] = right[j++];



    }
    static void mergeSorti(int arr[], int l, int r)
    {
        //code here
        if (l < r) {
            int mid = (l + r) / 2 ;
            mergeSorti(arr, l , mid);
            mergeSorti(arr, mid + 1, r);
            merge(arr, l, mid , r);
        }
        
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = s.nextInt();
            }

            mergeSorti(arr, 0, arr.length - 1);

            for (int i = 0; i < N; i++) {
                System.out.print(arr[i]);
            }

        }
    }
}
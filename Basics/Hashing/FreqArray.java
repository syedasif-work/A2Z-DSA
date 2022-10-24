package Basics.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FreqArray {
    
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i] , 1);
            }
        }

        for (int i = 1; i <= P; i++) {
            if (map.containsKey(i)){
                arr[i-1] = map.get(i);
            } else {
                arr[i-1] = 0;
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();
            int P = s.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = s.nextInt();
            }
            
            frequencyCount(arr, N, P);
        }
    }

}

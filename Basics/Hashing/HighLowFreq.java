package Basics.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighLowFreq {
    
    public static void display(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i] , 1);
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minKey = -1;
        int maxKey = -1;

        for (int key: map.keySet()) {
            if (map.get(key) > max) {
                maxKey = key;
                max = map.get(key);
            }
            else if (map.get(key) < min) {
                minKey = key;
                min = map.get(key);
            }
        }

        System.out.println(maxKey);
        System.out.println(minKey);
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = s.nextInt();
            }

            display(arr);
        }
    }
}

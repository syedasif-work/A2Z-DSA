// Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Geek an integer n and asked him to build a pattern.

// Help Geek to build a star pattern.

// Example 1:

// Input: 5

// Output:
// 1 
// 0 1 
// 1 0 1
// 0 1 0 1 
// 1 0 1 0 1

import java.util.*;

public class Pattern11 {

    static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            int start = i % 2 == 0 ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTriangle(n);
    }
}
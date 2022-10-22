// Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Geek an integer n and asked him to build a pattern.

// Help Geek to build the pattern.

// Example 1:

// Input: 4
// Output:
//    A
//   ABA
//  ABCBA
// ABCDCBA

import java.util.*;

public class Pattern17 {

    static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print((char)('A' + j - 1));
            }

            for (int j = i - 1; j >= 1 ; j--) {
                System.out.print((char)('A' + j - 1));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            printTriangle(n);
        }
    }
}
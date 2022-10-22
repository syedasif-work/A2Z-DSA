// Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Geek an integer n and asked him to build a pattern.

// Help Geek to build the pattern.

 

// Example 1:

// Input: 5

// Output:
// ABCDE
// ABCD
// ABC
// AB
// A

import java.util.*;

public class Pattern15 {

    static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
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
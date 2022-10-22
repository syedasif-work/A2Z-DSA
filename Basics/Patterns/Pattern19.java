// Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Geek an integer n and asked him to build a pattern.

// Help Geek to build the pattern.

 

// Example 1:

// Input: 5

// Output:
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********

import java.util.*;

public class Pattern19 {

    static void printTriangle(int n) {
        //Upper
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1 ; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= (i - 1) * 2; j++ ) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i + 1 ; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        // Lower
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i + 1 ; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= (i - 1) * 2; j++ ) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i + 1 ; j++) {
                System.out.print("*");
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
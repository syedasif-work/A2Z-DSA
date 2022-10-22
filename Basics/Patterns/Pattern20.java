// Ram is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Ram an integer n and asked him to build a pattern.

// Help Ram build a  pattern.

 

// Example 1:

// Input: 5

// Output:
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *

import java.util.*;

public class Pattern20 {

    static void printTriangle(int n) {
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

        for (int i = 1+1; i <= n; i++) {

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
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            printTriangle(n);
        }
    }
}
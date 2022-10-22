// Geek is very fond of patterns. Once, his teacher gave him a star pattern to solve. He gave Geek an integer n and asked him to build a pattern.

// Help Geek to build a star pattern.

// 5
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 

import java.util.*;

public class Pattern9 {

    static void printDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            printDiamond(n);
        }
    }
}
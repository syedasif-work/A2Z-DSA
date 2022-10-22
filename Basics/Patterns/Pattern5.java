// Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Geek an integer n and asked him to build a pattern.

// Help Geek build a star pattern.

// Example 1:

// Input: 5

// Output:
// * * * * *
// * * * * 
// * * * 
// * *  
// * 
import java.util.*;

public class Pattern5 {

    static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
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
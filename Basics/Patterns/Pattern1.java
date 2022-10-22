// Geek is very fond of patterns. Once, his teacher gave him a square pattern to solve. He gave Geek an integer n and asked him to build a pattern.

// Help Geek to build a star pattern.

// Example 1:

// Input: 5

// Output:
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *
import java.util.*;

public class Pattern1 {

    static void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            printSquare(n);
        }
    }
}
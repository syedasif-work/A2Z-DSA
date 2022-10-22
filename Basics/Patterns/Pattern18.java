// Ram is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Ram an integer n and asked him to build a pattern.

// Help Ram build a pattern.

// Example 1:

// Input: 5

// Output:
// E
// E D
// E D C
// E D C B
// E D C B A

import java.util.*;

public class Pattern18 {

    static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            char start = (char)('A' + n - 1);
            for (int j = 0; j < i; j++) {
                System.out.print((char)(start - j) + " ");
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
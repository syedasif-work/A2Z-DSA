// Geek is very fond of patterns. Once, his teacher gave him a  pattern to solve. He gave Geek an integer n and asked him to build a pattern.

// Help Geek to build a pattern.

// Example 1:

// Input: 5

// Output:
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3 
// 1 2  
// 1 
import java.util.*;

public class Pattern6 {

    static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(j + " ");
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
// Geek is very fond of patterns. Once, his teacher gave him a square pattern to solve. He gave Geek an integer n and asked him to build a pattern.

// Help Geek to build the pattern.

 

// Example 1:

// Input: 4

// Output:
// 4 4 4 4 4 4 4
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4

import java.util.*;

public class Pattern22 {

    static void printSquare(int n) {
        int x = 0;
        for (int i = 1; i <= 2*n-1; i++)
        {
            int k = n;
            if (i <= n) {
                x += 1;
            } else {
                x -= 1;
            }
            int ch1 = x, ch2 = x;
            for (int j = 1; j <=2*n-1; ++j)
            {
                System.out.print(k + " ");
                if(ch1 > 1 && j<n){
                    k--;
                    ch1--;
                }
                else if(ch2 > 1 && j>=2*n-x){
                    k++;
                    ch2--;
                }
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
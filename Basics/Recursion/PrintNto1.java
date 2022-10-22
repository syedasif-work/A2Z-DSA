package Basics.Recursion;

// Print numbers from N to 1 (space separated) without the help of loops.

// Example 1:

// Input:
// N = 10
// Output: 10 9 8 7 6 5 4 3 2 1

import java.util.Scanner;

public class PrintNto1 {
    
    public static void printNos(int N)
    {
        //Your code here
        if (N == 0) {
            return;
        }
        System.out.print(N + " ");
        printNos(N - 1);
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            printNos(n);
        }
    }
}

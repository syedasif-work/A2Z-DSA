package Basics.Recursion;

// Print numbers from 1 to N without the help of loops.

// Example 1:

// Input:
// N = 10
// Output: 1 2 3 4 5 6 7 8 9 10

// Example 2:

// Input:
// N = 5
// Output: 1 2 3 4 5

import java.util.Scanner;

public class Print1toN {
    
    public static void printNos(int N)
    {
        //Your code here
        if (N == 0) {
            return;
        }
        printNos(N - 1);
        System.out.print(N + " ");
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            printNos(n);
        }
    }
}

package Basics.Recursion;

// Print GFG n times without the loop.

// Example:

// Input:
// 5
// Output:
// GFG GFG GFG GFG GFG

import java.util.Scanner;

public class PrintGFG {
    
    public static void printGfg(int N)
    {
        //Your code here
        if (N == 0) {
            return;
        }
        System.out.print("GFG" + " ");
        printGfg(N - 1);
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            printGfg(n);
        }
    }
}

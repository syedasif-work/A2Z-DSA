package Basics.Recursion;

import java.util.Scanner;

public class Fib {
    
    public static int Fibonacci(int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        
        return Fibonacci(n - 1) + Fibonacci(n - 2);

    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            System.out.println(Fibonacci(n));
        }
    }
}

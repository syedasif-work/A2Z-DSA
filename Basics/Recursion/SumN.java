package Basics.Recursion;

import java.util.Scanner;

public class SumN {

    public static long sumN(int N) {

        if (N == 0) {
            return 0;
        }
        return N + sumN(N-1);

    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            System.out.println(sumN(n));
        }
    }
}
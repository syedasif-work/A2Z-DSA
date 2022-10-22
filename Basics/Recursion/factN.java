package Basics.Recursion;

import java.util.Scanner;

public class factN {
    
    public static long fact(int N) {

        if (N == 0) {
            return 1;
        }
        return N * fact(N-1);

    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            System.out.println(fact(n));
        }
    }
}

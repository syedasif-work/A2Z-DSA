package Basics.Recursion;

import java.util.Scanner;

public class Palindrome {
    
    static int isPalindrome(String S, int start , int end) {
        if (start >= end) {
            return 1;
        }
        if (S.charAt(start) != S.charAt(end)) {
            return 0;
        }
        return isPalindrome(S, start + 1, end - 1);

    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String st = s.nextLine();
            System.out.println(isPalindrome(st, 0, st.length() - 1));
        }
    }

}

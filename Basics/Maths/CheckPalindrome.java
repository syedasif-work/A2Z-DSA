// Given an integer, check whether it is a palindrome or not.

// Example 1:

// Input: n = 55555
// Output: Yes

// Example 2:

// Input: n = 123
// Output: No

import java.util.Scanner;

public class CheckPalindrome {

    public static String is_palindrome(int n)
    {
        // Code here
        int k = n;
        int reverse = 0;

        while (k != 0) {
            int digit = k % 10;
            reverse = reverse * 10  + digit;
            k = k / 10;
        }

        return reverse == n ? "Yes" : "No";
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n =  sc.nextInt();
            System.out.println(is_palindrome(n));
        }
    }
}

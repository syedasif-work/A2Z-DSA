// Given a number N. Count the number of digits in N which evenly divides N.
 

// Example 1:

// Input:
// N = 12
// Output:
// 2
// Explanation:
// 1, 2 both divide 12 evenly
// Example 2:

// Input:
// N = 23
// Output
// 0
// Explanation:
// 2 and 3, none of them
// divide 23 evenly

import java.util.Scanner;

public class CountDigits {

    static int evenlyDivides(int N){
        // code here
        int k = N;
        int count = 0;

        while (k > 0) {
            int digit = k % 10;
            if (digit != 0 && N % digit == 0) {
                count += 1;
            }
            k = k / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(evenlyDivides(n));
        } 
    }
}
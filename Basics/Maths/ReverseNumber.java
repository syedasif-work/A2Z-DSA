import java.util.Scanner;

public class ReverseNumber {

    static Long reversedBits(Long X) {
        // code here
        long reverse = 0;
        long remainder = 0;

        int n = 1;

        while (n <= 32) {
            remainder = X % 2;
            reverse = reverse * 2 + remainder;
            X =  X / 2;
            n += 1;
        }

        return reverse;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();
            System.out.println(reversedBits(n));
        } 
    }
}

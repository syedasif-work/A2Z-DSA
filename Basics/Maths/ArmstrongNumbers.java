import java.util.Scanner;

public class ArmstrongNumbers {

    static String armstrongNumber(int n){
        // code here
        int result = 0;
        int temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            result += digit * digit * digit;
            temp /= 10;
        }

        return result == n? "Yes" : "No";
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(armstrongNumber(n));
        } 
    }
}

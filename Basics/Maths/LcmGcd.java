import java.util.Scanner;

public class LcmGcd {

    static long gcd(long a,long b) {
       if(b==0) return a;
       return gcd(b,a%b);
    }

    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        long gcd = gcd(A, B);
        return new Long[]{A * B / gcd, gcd};
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            long A =  sc.nextLong();
            long B =  sc.nextLong();
            System.out.println(lcmAndGcd(A, B));
        }
    }
    
}

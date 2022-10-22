import java.util.Scanner;

public class SumDivisors {

    static long sumOfDivisors(int N){
        // code here
        long sumTotal=0;
        for(int i=1;i<=N;i++)
        {
            sumTotal+=(N/i)*i;
            //How many time 1 came, 2 came , 3 came : i.e. N/i
            //Multiply the number of occurence with the Number and get the sum
        }
        return sumTotal;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(sumOfDivisors(n));
        } 
    }
}

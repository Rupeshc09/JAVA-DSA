
import java.util.Scanner;

public class Pracfibo{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        // for (int i = 2; i <= n; i++) {
        //     int temp=a;
        //     a=b;
        //     b=b+temp;
        // }
        // System.out.println(b);

        //check number is belong or not
        while (a < n) {
            int temp = a;
            a = b;
            b = temp + b;
        }

        if (a == n) {
            System.out.println("Fibonacci number");
        } else {
            System.out.println("Not a Fibonacci number");
        }
    }
}
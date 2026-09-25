
import java.util.Scanner;

class Largest {

    public static void main(String[] args) {
        int a, b, c, max;
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter 3 Number : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // 1.approach
        // if(a>b && a>c){
        //     max=a;
        // }else if(b>c){
        //     max=b;
        // }else{
        //     max=c;
        // }

        // 2.approach
        // max = a;
        // if (b > max) {
        //     max = b;
        // }
        // if (c > max) {
        //     max = c;
        // }

        //3.
        max=Math.max(c,Math.max(a,b));

        System.out.println(max);

    }
}

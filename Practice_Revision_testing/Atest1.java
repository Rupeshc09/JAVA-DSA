
import java.util.Scanner;

class Atest1{
    public static void main(String[] args) {
        int choice;
        Scanner sc=new Scanner(System.in);
         System.out.println("eneter choice 1,2,3,4");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.err.println("one");
                    // break;
                case 2:
                    System.err.println("two");
                    // break;
                case 3:
                    System.err.println("three");
                    break;
                case 4:
                    System.err.println("four");
                    // break;
                default:
                    System.err.println("invalid");
            }
    }
}
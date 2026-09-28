
import java.util.Scanner;

class Swithcase {

    public static void main(String[] args) {
        int choice;
        char wish;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("eneter choice 1,2,3,4");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.err.println("one");
                    break;
                case 2:
                    System.err.println("two");
                    break;
                case 3:
                    System.err.println("three");
                    break;
                case 4:
                    System.err.println("four");
                    break;
                default:
                    System.err.println("invalid");
            }

            System.err.println("do u want to continue");
            wish = sc.next().charAt(0);
        } while (wish == 'y' || wish == 'Y');
    }
}

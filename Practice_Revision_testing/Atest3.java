
import java.util.Scanner;

class Atest3 {

    static int Choice;

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        do {
             Choice = sc.nextInt();
            System.err.println(check(Choice));;
        } while (Choice != 5);
    }

    static boolean  check(int num) {
        boolean flag = true;
        if (num < 2) {
            return  false;
        } else {
            for (int i = 2; i * i < num; i++) {
                if (num % i == 0) {
                    return  false;
                }
            }

        }
        return true;
    }
}

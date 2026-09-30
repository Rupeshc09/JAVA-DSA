
import java.util.Scanner;

class Function {

    static void sum(int a, int b) {
        int summ = a + b;
        System.err.println("sum : " + summ);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // sum(a, b);
        String name = "Rupesh";
        change(name);
        System.err.println("name is : " + name);
        // System.err.println(namste("rupesh"));

    }
  
    static void change(String name) {
        name = "Ajay";
    }

    static String namste(String name) {
        return "hello " + name;
    }

}

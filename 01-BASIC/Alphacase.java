
import java.util.Scanner;

class Alphacase{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        String str=sc.next();
        char ch=str.charAt(0);
        if('z'>=ch && 'a'<=ch){
            System.err.println("lower");
        }else{
            System.err.println("upper");
        }
    }
}
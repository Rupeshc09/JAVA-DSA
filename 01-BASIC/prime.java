
import java.util.Scanner;

class prime{

    public static void main(String[] args) {

        // System.out.println(args[1]);
        Scanner input= new Scanner(System.in);
        
        System.err.println(input.nextLine());
        int num=12;
        boolean check=true;
        for (int i = 2; i*i < num; i++) {
            if(num%i==0){
                check=false;
            break;
            } 
        }
        if(check){
            System.err.println("Prime number : "+num);
        }else{
            System.out.println("not prime");
        }

    }
  
}

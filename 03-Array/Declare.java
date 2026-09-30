
import java.util.Scanner;

class Declare{
    public static void main(String[] args) {
        int [] arr=new int[2];
        int count=0;
        Scanner in=new Scanner(System.in);
        while(in.hasNextInt()){
            if(count<arr.length){
            arr[count]=in.nextInt();
            count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print((arr[i])+" ");
        }

        
    }
}
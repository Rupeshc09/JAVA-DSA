
import java.util.Scanner;

class Array01{
public static void main(String[] args) {
    int []arr=new int[2];
    System.err.println(arr[0]);//0

    String []arrs=new String[2];
    System.err.println(arrs[0]);//null
    Scanner sc=new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
    }
    for(int ele:arr){
        System.out.println(ele);
    }
}
}
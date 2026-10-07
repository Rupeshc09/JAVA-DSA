
import java.util.Arrays;
import java.util.Scanner;

class Btest1{
    public static void main(String []args){
        int [][]arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
         for (int i = 0; i < arr.length; i++) {
            System.err.println(Arrays.toString(arr[i]));
        }
    }
}
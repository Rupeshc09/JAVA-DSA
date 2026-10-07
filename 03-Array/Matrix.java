
import java.util.Arrays;
import java.util.Scanner;



class Matrix{
    public static void main(String[] args) {

        // int [][] arr={{1,2,3},{11,22,33}};
        int [][] arr=new int[2][3];
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
           
        }
        // ================================================
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.err.print(arr[i][j]);
            }
            System.err.println("");
        }
        for (int i = 0; i < arr.length; i++) {
            System.err.println(Arrays.toString(arr[i]));
        }
        for (int [] elem : arr) {
            System.err.println(Arrays.toString(elem));
        }
    }
}
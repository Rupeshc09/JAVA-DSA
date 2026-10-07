
import java.util.Scanner;

class ArrayElement{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element");
        n=sc.nextInt();
        int arr[]=new int [n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(12==arr[i]){
                System.err.println("found at index :"+i);
                break;
            }
        }
        
        
    }
}
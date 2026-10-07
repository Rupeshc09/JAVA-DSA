
import java.util.Arrays;



class Reverse{
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        reverseMethod(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverseMethod(int [] arr) {
        int start=0,end=arr.length-1;
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    
}
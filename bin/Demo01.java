import java.util.*;
import static java.lang.System.*;
class Demo01{
    public static void main(String []args){
       int[] arr={11,2,1111,3,42,22};
       for(int ele:arr){
       if(check(ele)%2==0){
        out.println(ele);
       }
     }
    }
   static int check(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num)+1);
    }
}
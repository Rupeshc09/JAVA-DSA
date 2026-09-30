import java.util.Arrays;
class Scope {
 static int sum=10;
    public static void main(String[] args) {
        int a = 100;
        {  // int a=10;//cant reinitialize
            System.out.println("a " + sum);
            int b = 10;
        }
        // System.err.println(b);//cant access but reinitialize
        int b = 10;
        print(1,2,3);
    }

    static  void print(int ...arr){
        System.out.println(Arrays.toString(arr));
    }
}

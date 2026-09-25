

class Fibonaci{
    public static void main(String[] args) {
        int num=10;
        int a=0,b=1,temp;
        int count=2;


        while(count<=num){
            System.err.print(" "+a);
            temp=b;
            b=a+b;
            a=temp;
            count++;   
        }

        // while(count<=num){
        //     temp= b;
        //     b=a+b;
        //     a=temp;
        //     count++;
        // }
        // System.err.println(b);

        
    }
}
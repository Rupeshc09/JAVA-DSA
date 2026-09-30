


class Atest2 {

    public static void main(String[] args) {
        int[] arr={1,2,3};
        int a;
        {
            a=10;
            int b=20;
        }
        // check(10,20);
        System.out.println();
    }

    static void check(int a,int b) {
      int temp=a;
      a=b;
      b=temp;
      System.err.println("a,b"+a+""+b);
     }

}
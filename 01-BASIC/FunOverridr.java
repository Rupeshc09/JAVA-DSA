class FunOverridr{
    public static void main(String[] args) {
        // run("dhdh");
        run(10,10);
        // run(2);
        //at comile-time dision is made which fuction should run
    }
    static void run(int a){
        System.err.println("a"+a);
    }

    static void run(int a,int b){
        System.err.println(a+b);
    }

    static void run(String a){
        System.err.println(a);
    }
}
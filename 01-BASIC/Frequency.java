class Frequency{
    public static void main(String[] args) {
        long num=1237476367363673637L;
        int count=0;
        while(num>0){
            if((num%10)==7){
                count++;
            }
            num/=10;
        }
        System.err.println(count);
    }
}
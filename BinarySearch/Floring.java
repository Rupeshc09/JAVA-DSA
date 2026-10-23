class Floring{
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        System.err.println('a'>'b');
        System.err.println(arr[check(arr,0,5)]);
    }
    //if tar=15
    //return start -ceiling  43
     //return end -floor 14
    static int check(int [] arr,int i,int j) {
        int tar=15;
        int mid=0;
        while (i<=j) { 
             mid=i+(j-i)/2;
            if(arr[mid]>tar){
                j=mid-1;
            }else if(arr[mid]<tar){
                i=mid+1;
            }else{
                return mid;
            }
        }

        return j;
    }
}
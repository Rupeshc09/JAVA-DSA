class PositionInInfinite{
    public static void main(String[] args) {
      int  arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
      int tar= 9;
      System.out.println(check(arr,tar));
    }
    static int check(int []arr,int tar){
        int s=0;
        int e=1;
        while(arr[e]<tar){
            int temp=e+1;
            e=e+(e-s+1)*2;
            s=temp;
        }
        return binarySearch(arr,s,e,tar);

    }
    static int binarySearch(int []arr,int i,int j,int tar){
     while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>tar){
                j=mid-1;
                
            }else if(arr[mid]<tar){
                i=mid+1;

            }else{
                return mid;
            }
        }
        return -1;
    }
}
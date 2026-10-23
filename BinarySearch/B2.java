class B2{
    public static void main(String[] args) {
        int []arr={1,3,6,9,13,14,20,26,42};
        int start=0;
        int end=arr.length-1;
        int tar=3;
        while(start<=end){
           int mid=start+(end-start)/2;
           if(arr[mid]>tar){
            end=mid-1;
           }else if(arr[mid]<tar){
            start=mid+1;
           }else{
            System.err.println(mid);
            break;
           }
        }
    }
}
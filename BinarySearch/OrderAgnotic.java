class OrderAgnotic{
    public static void main(String[] args) {
        int[] arr={-2,0,6,11,21,32,41,61};
        int start=0;
        int end=arr.length-1;
       
       System.out.println(check(start,end,arr));
    }
    static int check(int start,int end,int []arr){
        boolean flag=arr[start]>arr[end];
         int tar=21;
        while (start<=end) { 
            int mid=start+(end-start)/2;
            if(tar==arr[mid]){
                return mid;
            }

            if(flag){
               if(arr[mid]<tar){
                    end=mid-1;
                 }else{
                    start=mid+1;
                 }
            }else{
                 if(arr[mid]>tar){
                    end=mid-1;
                 }else{
                    start=mid+1;
                 }
            }
        }
        return -1;
    }
}
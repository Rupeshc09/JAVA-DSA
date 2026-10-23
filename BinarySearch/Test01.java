class Test01{
    public static void main(String[] args) {
        int tar=33;
        int []arr={2,3,4,7,7,7,8,9};
        int f=-1;
        int l=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==7){
                if(f==-1){
                    f=i;
                }else{
                    l=i;
                }
            }
        }
        System.err.println(f+""+l);
       
        // System.out.println(check(arr,tar));
    }
    static int check(int []arr,int tar){
        boolean flag=arr[arr.length-1]<arr[0];
        int i=0;
        int j=arr.length-1;
        while (i<=j) { 
            int mid=i+(j-i)/2;
            if(arr[mid]==tar){
                return  mid;
            }
            if (flag) {
                 if(arr[mid]<tar){
                    j=mid-1;
                }else{
                    i=mid+1;
                }
            }else{
                if(arr[mid]>tar){
                    j=mid-1;
                }else{
                    i=mid+1;
                }
            }
        }
        return -1;
    }
}
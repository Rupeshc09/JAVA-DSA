
class B1{
    public static void main(String[] args){
        int[] arr={1,22,44,55,66,101};
        int tar=1;
        int i=0,j=arr.length-1;
        for(int e:arr){
         System.out.println(e);
        }
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>tar){
                j=mid-1;
                
            }else if(arr[mid]<tar){
                i=mid+1;

            }else{
                System.out.println(mid+"::"+arr[mid]);
                break;
            }
        }
    }
}
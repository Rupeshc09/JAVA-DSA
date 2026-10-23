class SmallLetter{
    public static void main(String[] args) {
        char []letters = {'c','f','j'};
         char target = 'd';
        System.out.println(check(letters,target));
    }
    static int check(char[]letters,char target) {
        int s=0;
        int e=letters.length-1;
      
        int mid=0;
        while(s<=e){
            mid =s+(e-s)/2;
            if(letters[mid]>target){
                e=mid-1;
            }else if(letters[mid]<target){
                s=mid+1;
            }else{
                return mid;
            }
        }
        return s;
    }
}
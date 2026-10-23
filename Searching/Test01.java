
class Test01 {

    public static void main(String[] args) {
        int[] arr = {111, 100, 84, 55, 40, 30, 10};
        
        int i = 0, j = arr.length - 1;
       System.out.println(check(arr, i, j));
    }

    static int  check(int[] arr, int i, int j) {
        int tar = 84;
        boolean flag = arr[i] > arr[j];
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if(arr[mid]==tar){
                return mid;
            }
            if (flag) {
                if (tar > arr[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }

            } else {
                if (tar < arr[mid]) {
                    j = mid - 1;

                } else {
                    i = mid + 1;
                }
            }

        }
        return -1;
    }

}

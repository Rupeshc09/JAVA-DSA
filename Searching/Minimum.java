class Minimum{
    public static void main(String[] args) {
        int []arr={11,0,2,-3,4};
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        System.err.printf("Minimum : "+min);
    }
}
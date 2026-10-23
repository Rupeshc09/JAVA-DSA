
import java.util.Arrays;


class Onerotation {

    public static void main(String[] args) {
        int i = 0, k = 3;
        int[] arr = {1, 2, 3, 4, 5};
        int j = k - 1;
        rotate(arr, i, j);
        rotate(arr, k, (arr.length - 1));
        System.err.println(Arrays.toString(arr));
    }

    static void rotate(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }
}

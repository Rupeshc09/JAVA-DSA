
class EvenNumbers {

    public static void main(String[] args) {
        int[] nums = {11, 222, 33, 444, 5, 66};
//1295 

        int count = 0;
        for (int ele : nums) {
            int dig = 0;
            while (ele > 0) {
                dig += 1;
                ele /= 10;
            }
            if (dig % 2 == 0) {
                count++;
            }

        }

        System.err.println(count);
    }
}

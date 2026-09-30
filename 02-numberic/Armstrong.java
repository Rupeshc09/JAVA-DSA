

class Armstrong {

    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (check(i)) {
                System.err.println(i);
            }
        }

    }

    static boolean  check(int num) {
        int sum = 0;
        int temp = num;
        while (num > 0) {
            int dig = num % 10;
            sum += dig * dig * dig;
            num = num / 10;
        }
        return sum == temp;
    }
}

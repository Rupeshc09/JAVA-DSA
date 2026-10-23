
import java.util.Scanner;

class SearchInString {

    public static void main(String[] args) {
        String name = "IACSD";
        System.err.println("Enter char u want to find in IACSD");
        Scanner sc = new Scanner(System.in);
        char str = sc.next().charAt(0);
      
        
       //methos 1
    //    System.err.println(Arrays.toString(name.toCharArray()));
        for (char elem : name.toCharArray()) {
            if (str == elem) {
                System.err.println("yes");
            }
        }
       //Method 2 //search(name, str);

    }

    static void search(String name, char str) {
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == str) {
                System.err.println("yes");
            }
        }
    }
}

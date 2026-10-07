
import java.util.ArrayList;


class Test01{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(10);
        list.add(100);
        list.add(1000);
        System.out.println(list);
        list.remove(1);
        list.remove(100);
        System.err.println(list);
    }
}
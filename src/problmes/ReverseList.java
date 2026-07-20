package problmes;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("apple");
        arr.add("banana");
        arr.add("mango");

        System.out.println("list:"+arr);

        Collections.reverse(arr);

        System.out.println("list:"+arr);
    }
}

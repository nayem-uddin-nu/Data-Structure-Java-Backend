package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(13);
        a.add(14);
        a.add(16);

        Object[] arr = a.toArray();
        System.out.println(arr[3]);
        for(Integer ar : a){
            System.out.println(ar);
        }


        System.out.println(a.size());

        a.remove(0);
    }
}

package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // list
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("Nayem");
        list.add(12);
        list.add("13");

        System.out.println(list);

        list.stream().filter( item -> item.equals(12)).forEach(e -> System.out.println("for Each "+e));

        List<Integer> llist = new LinkedList<>();
        List<Integer> arrList = new ArrayList<>();
    }
}

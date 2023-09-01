package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();

        list.add("Java");
        list.add("CPP");
        list.add("Python");

        System.out.println(list);

        list.add(1, "C#");
        System.out.println(list);

        System.out.println(list.size());
        list.remove("Java");
        System.out.println(list);

    }
}

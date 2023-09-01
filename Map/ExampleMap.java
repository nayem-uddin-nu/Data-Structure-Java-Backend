package Map;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {
    public static void main(String[] args) {
        // HashMap provides basic implementation of Map interface
        // stores item in key-value pair
        Map<Integer, String> map = new HashMap<>(0);
        map.put(100, "nayem");
        map.put(200, "nayem");
        map.put(300, "nayem");
        map.put(400, "nayem");
        for(Map.Entry<Integer, String> m: map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());

        System.out.println(map.remove(100));
        System.out.println(map);
    }
}

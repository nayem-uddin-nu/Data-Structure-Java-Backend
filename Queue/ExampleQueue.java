package Queue;

import java.util.PriorityQueue;

public class ExampleQueue {
    // Queue is an interface extends Collection interface
   public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(10);
        q.add(12);
        q.add(30);

        System.out.println(q);

        System.out.println(q.remove());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
   }

}

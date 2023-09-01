package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ExampleQueue1 {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        
        ReverseStringUsingQueue.reverse(q);
    }
    
}


class ReverseStringUsingQueue{
    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();

        while(!queue.isEmpty())
            stack.push(queue.remove());

        while(!stack.isEmpty())
            queue.add(stack.pop());

        System.out.println(queue);
            
    }
}

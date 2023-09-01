package Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // it implements vector class vector implements List->Collection->Iterable
        Stack<Integer> v = new Stack<>();
        v.push(10);
        v.push(20);
        v.push(30);
        v.push(40);
        System.out.println(v.size());
        System.out.println(v.peek());
        System.out.println(v.pop());
        System.out.println(v);
        System.out.println(v.search(10));
    }
}

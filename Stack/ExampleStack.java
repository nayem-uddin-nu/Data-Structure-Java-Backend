package Stack;

import java.util.Stack;

public class ExampleStack {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String reversed = StringReverse.reverse(str);
        System.out.println(reversed);

    }    
}
    


class StringReverse{
    public static String reverse(String values){

        Stack<Character> stack = new Stack<>();

        for(char ch: values.toCharArray())
            stack.push(ch);

        String reversed = "";

        while(!stack.empty())
            reversed+=stack.pop();

        return reversed;
    }
}
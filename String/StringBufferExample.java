package String;

public class StringBufferExample {
  

    // it is a mutable object
    public static void main(String[] args) {
        // methods -> append(), insert(), delete(), reverse()
        StringBuffer buffer = new StringBuffer("Hello Java Using StringBuffer. ");
        System.out.println(buffer); 
        buffer.append("Oke bye");
        System.out.println(buffer);
        System.out.println(buffer.capacity());

        
    }
}

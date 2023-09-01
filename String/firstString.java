package String;

public class firstString {
    public static void main(String[] args) {
        
        // using string literal
        String s = "Hello";
        System.out.println(s);

        // using string object
        String s1 = new String("Hello");
        System.out.println(s1);


        // string methods
        System.out.println(s.length());
        System.out.println(s.compareTo(s1));
        System.out.println(s.charAt(0));
        System.out.println(s.substring(0, 3));
        System.out.println(s.equals(s1));
        System.out.println(s.contains(s1));
        System.out.println(s.toLowerCase());
        System.out.println(s.toCharArray());

    }
}

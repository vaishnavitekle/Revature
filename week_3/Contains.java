import java.util.*;
public class contains {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana"); 
        list.add("cherry");
        System.out.println("List contains 'banana': " + list.contains("banana"));
    }
}

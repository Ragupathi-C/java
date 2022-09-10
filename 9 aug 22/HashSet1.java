import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<String>();

        hs.add("Hello");
        hs.add("Welcome");
        hs.add("To Java");

        System.out.println("Using Hashset add()" + hs);

        hs.remove("Hello");
        System.out.println("Using Hashset remove()" + hs);

        hs.size();
        System.out.println("Using Hashset size()" + hs);
    }
}
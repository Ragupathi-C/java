import java.util.*;

public class TreeExample {
    public static void main(String[] args) {
        Set<String> hs = new TreeSet<String>();
        hs.add("Hello");
        hs.add("Welcome");
        hs.add("To Java");
        System.out.println("using treeset add()" + hs);
        hs.remove("Hello");
        System.out.println("using treeset remove()" + hs);
        hs.size();
        System.out.println("using treeset size()" + hs);
        hs.add("Hello");
        hs.add("Academy");
        hs.add("Ict");
        hs.add("java");
        hs.add("course");
        TreeSet ts = new TreeSet<String>(hs);
        System.out.println("the sorted list is" + ts);
        System.out.println("the first element is :" + (String) ts.first());
        System.out.println("the last element is :" + (String) ts.last());

    }
}

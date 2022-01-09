import java.util.HashSet;
import java.util.Iterator;

public class HashSetType {
    public static void main(String[] args) {

        HashSet<String> newSet = new HashSet<String>();

        newSet.add("Red");
        newSet.add("Green");
        newSet.add("Black");
        newSet.add("White");
        newSet.add("Pink");
        newSet.add("Yellow");

        System.out.println(newSet);
        System.out.println("\niterate through all elements in a hash list: ");
        Iterator<String> p = newSet.iterator();

        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }
}

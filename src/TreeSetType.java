import java.util.TreeSet;

public class TreeSetType {
    public static void main(String[] args) {
        TreeSet<String> newTreeSet = new TreeSet<>();
        newTreeSet.add("Red");
        newTreeSet.add("Green");
        newTreeSet.add("Orange");
        newTreeSet.add("White");
        newTreeSet.add("Black");
        System.out.println("Tree set: " + newTreeSet);
        System.out.println("\niterate through all elements in a tree set: ");
        for (String element : newTreeSet) {
            System.out.println(element);
        }
    }
}

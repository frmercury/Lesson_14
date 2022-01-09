import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListType {

    public static void main(String[] args) {

        System.out.println("1. create a new array list:");

        List<String> initialColorList = new ArrayList<>();
        initialColorList.add("Red");
        initialColorList.add("Blue");
        initialColorList.add("Green");
        initialColorList.add("Brown");
        initialColorList.add("Orange");

        System.out.println(initialColorList + "\n");

        iteration(initialColorList);
        insertElement(initialColorList);
        retrieveElement(initialColorList);
        updateSpecificElement(initialColorList);
        removeThirdElement(initialColorList);
        searchElement(initialColorList);
        sortList(initialColorList);
        copyList(initialColorList);
        shuffleElements(initialColorList);
        reverseElements(initialColorList);
        extractPortion(initialColorList);
        compareList();
        swapTwoElements(initialColorList);
        joinList(initialColorList);
        cloneList();
        emptyList();
        trimCapacity();
        increaseSize();
        replaceSecondElement(initialColorList);
        printElementsPosition(initialColorList);
    }

    public static void iteration (List colorList) {
        System.out.println("2. iterate through all elements in a array list:");
        colorList.forEach(System.out::println);
        System.out.println("");
    }

    public static void insertElement (List colorList) {
        System.out.println("3. insert an element into the array list at the first position:");
        colorList.add(0, "Black");
        System.out.println(colorList);
        System.out.println("");
    }

    public static void retrieveElement (List colorList) {
        System.out.println("4. retrieve an element (at a specified index) from a given array list:");
        System.out.println(colorList.get(0));
        System.out.println("");
    }

    public static void updateSpecificElement (List colorList) {
        System.out.println("5. update specific array element by given element:");
        colorList.set(0, "Purple");
        System.out.println(colorList);
        System.out.println("");
    }

    public static void removeThirdElement (List colorList) {
        System.out.println("6. remove the third element from a array list:");
        colorList.remove(2);
        System.out.println(colorList);
        System.out.println("");
    }

    public static void searchElement (List colorList) {
        System.out.println("7. search an element in a array list:");
        String searchedElement = "Orange";
          if (colorList.contains(searchedElement)) {
                System.out.printf("Element '%s' is present", searchedElement);
            } else {
              System.out.printf("Element '%s' is absent", searchedElement);
          }
    }

    public static void sortList (List colorList) {
        System.out.println("8. sort a given array list:");
        Collections.sort(colorList);
        System.out.println("Sorted list: " + colorList + "\n");
    }

    public static void copyList (List colorList) {
        System.out.println("9. copy one array list into another:");
        List<String> dimensionList = new ArrayList<>();
        dimensionList.add("Long");
        dimensionList.add("Short");
        System.out.println("Copied list: " + dimensionList);
        Collections.copy(colorList, dimensionList);
        System.out.println("Resulted list: " + colorList);
        System.out.println("");
    }

    public static void shuffleElements (List colorList) {
        System.out.println("10. shuffle elements in a array list:");
        Collections.shuffle(colorList);
        System.out.println("Resulted list: " + colorList);
        System.out.println("");
    }

    public static void reverseElements (List colorList) {
        System.out.println("11. reverse elements in a array list:");
        Collections.reverse(colorList);
        System.out.println("Resulted list: " + colorList);
        System.out.println("");

    }

    public static void extractPortion (List colorList) {
        System.out.println("12. extract a portion of a array list:");
        List<String> extractedList = colorList.subList(0, 2);
        System.out.println("First two elements: " + extractedList);
        System.out.println("");
    }

    public static void compareList () {
        System.out.println("13. compare two array lists:");

        List<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Brown");
        colorList.add("Orange");

        List<String> newColorList = new ArrayList<>();
        newColorList.add("Red");
        newColorList.add("Blue");
        newColorList.add("White");
        newColorList.add("Green");
        newColorList.add("Orange");

        ArrayList<String> compareList = new ArrayList<>();
        for (String str: colorList)
            compareList.add(newColorList.contains(str) ? "True" : "False");
        System.out.println(compareList);

        System.out.println("");
    }

    public static void swapTwoElements (List colorList) {
        System.out.println("14. swap two elements in an array list:");
        Collections.swap(colorList, 0, 2);
        System.out.println("Array list after swap: " + colorList);
        System.out.println("");
    }

    public static void joinList (List colorList) {
        System.out.println("15. join two array lists:");
        List<String> dimensionList = new ArrayList<>();
        dimensionList.add("Long");
        dimensionList.add("Short");

        ArrayList<String> joinList = new ArrayList<>();
        joinList.addAll(colorList);
        joinList.addAll(dimensionList);
        System.out.println("Joined array: " + joinList);

        System.out.println("");
    }

    public static void cloneList () {

        System.out.println("16. clone an array list to another array list:");
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Pink");

        ArrayList<String> newColorList = (ArrayList<String>)colorList.clone();
        System.out.println("Cloned array list: " + newColorList);
        System.out.println("");
    }

    public static void emptyList () {
        System.out.println("17. empty an array list :");
        List<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Pink");

        colorList.removeAll(colorList);
        System.out.println("Array: " + colorList);
        System.out.println("");
        System.out.println("18. test an array list is empty or not :");
        System.out.println("Is list is empty? - " + colorList.isEmpty());
        System.out.println("");
    }


    public static void trimCapacity () {
        System.out.println("19. trim the capacity of an array list the current list size:");
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Brown");
        colorList.add("Orange");
        colorList.trimToSize();
        System.out.println(colorList);
        System.out.println("");
    }

    public static void increaseSize () {
        System.out.println("20. increase the size of an array list:");
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Brown");
        colorList.add("Orange");
        colorList.ensureCapacity(6);
        colorList.add("Yellow");
        System.out.println("New arrList: " + colorList);
        System.out.println("");
    }

    public static void replaceSecondElement (List colorList) {
        System.out.println("21. replace the second element of a ArrayList with the specified element:");
        String newColor = "White";
        colorList.set(1,newColor);
        System.out.println("Replaced list: " + colorList);
        System.out.println("");
    }

    public static void printElementsPosition (List colorList) {

        System.out.println("22. print all the elements of a ArrayList using the position of the elements:");
        int elements = colorList.size();
        for (int i = 0; i < elements; i++)
            System.out.println(colorList.get(i));
    }
}
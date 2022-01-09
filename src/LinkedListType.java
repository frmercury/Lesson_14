import java.util.*;

public class LinkedListType {

    public static void main(String[] args) {

        System.out.println("1. create a new linked list:");
        LinkedList<String> initialList = new LinkedList<>();

        initialList.add("Red");
        initialList.add("Green");
        initialList.add("Black");
        initialList.add("White");
        initialList.add("Pink");
        initialList.add("Yellow");
        System.out.println(initialList);
        System.out.println("");

        iterateElements(initialList);
        iterateElementsSpecifiedPosition(initialList);
        iterateElementsReverse(initialList);
        insertSpecifiedElement(initialList);
        insertFirstLastElement(initialList);
        insertSpecifiedElementFront(initialList);
        insertSpecifiedElementEnd(initialList);
        insertSomeElementEnd(initialList);
        getFirstLastOccurrence(initialList);
        displayElementsTheirPositions(initialList);
        removeSpecifiedElement(initialList);
        removeFirstLastElement(initialList);
        removeAllElements();
        swapTwoElements(initialList);
        shuffleElements(initialList);
        joinTwoLists(initialList);
        cloneTwoLists(initialList);
        removeFirstElement(initialList);
        retrieveFirstElement(initialList);
        retrieveLastElement(initialList);
        checkElementExists(initialList);
        convertToArrayList(initialList);
        compareTwoLists();
        testListIsEmpty(initialList);
        replaceElement();
    }


    public static void iterateElements(List colorList) {
        System.out.println("2. iterate through all elements in a linked list:");
        colorList.forEach(System.out::println);
        System.out.println("");
    }

        public static void iterateElementsSpecifiedPosition(List colorList) {
            System.out.println("3. iterate through all elements in a linked list starting at the specified position:");
            Iterator i = colorList.listIterator(1);
            while (i.hasNext()) {
                System.out.println(i.next());
            }
            System.out.println("");
        }

        public static void iterateElementsReverse (LinkedList colorList){

            System.out.println("4. iterate a linked list in reverse order:");
            Iterator rev = colorList.descendingIterator();

            System.out.println("Elements in Reverse Order:");
            while (rev.hasNext()) {
                System.out.println(rev.next());

            }
            System.out.println("");
        }

        public static void insertSpecifiedElement (List colorList){
            System.out.println("5. insert the specified element at the specified position in the linked list:");
            colorList.add(1, "Yellow");
            System.out.println("The linked list:" + colorList);
            System.out.println("");
        }

        public static void insertFirstLastElement (LinkedList colorList){
            System.out.println("6.  insert elements into the linked list at the first and last position:");
            colorList.addFirst("White");
            colorList.addLast("Pink");
            System.out.println("Final linked list:" + colorList);
            System.out.println("");
        }

        public static void insertSpecifiedElementFront (LinkedList colorList){
            System.out.println("7.  insert the specified element at the front of a linked list:");
            colorList.offerFirst("Black");
            System.out.println(colorList);
            System.out.println("");
        }

        public static void insertSpecifiedElementEnd (LinkedList colorList){
            System.out.println("8. insert the specified element at the end of a linked list:");
            colorList.offerLast("Purple");
            System.out.println(colorList);
            System.out.println("");
        }
        public static void insertSomeElementEnd (LinkedList colorList){
            System.out.println("9.  insert some elements at the specified position into a linked list:");
            LinkedList <String> newColorList = new LinkedList <> ();
            newColorList.add("White");
            newColorList.add("Brown");

            colorList.addAll(1, newColorList);
            System.out.println("LinkedList with insertions:" + colorList);
            System.out.println("");
        }

        public static void getFirstLastOccurrence (LinkedList colorList){
            System.out.println("10. get the first and last occurrence of the specified elements in a linked list:");
            Object first = colorList.getFirst();
            System.out.println("First element is: " + first);

            Object last = colorList.getLast();
            System.out.println("Last element is: " + last);
            System.out.println("");
        }

        public static void displayElementsTheirPositions (List colorList){
            System.out.println("11. display the elements and their positions in a linked list:");
            for (int i = 0; i < colorList.size(); i++) {
                System.out.println("Element at index "+ i +": " + colorList.get(i));
            }
            System.out.println("");
        }

        public static void removeSpecifiedElement (List colorList){
            System.out.println("12. remove a specified element from a linked list:");
            System.out.println("Removed element: " + colorList.get(1));
            colorList.remove(1);
            System.out.println("The New linked list: " + colorList);
            System.out.println("");
        }

        public static void removeFirstLastElement (LinkedList colorList){
            System.out.println("13.  remove first and last element from a linked list:");
            Object first = colorList.removeFirst();
            System.out.println("Element removed: "+ first);

            Object last = colorList.removeLast();
            System.out.println("Element removed: "+ last);
            System.out.println("The New linked list: " + colorList);
            System.out.println("");
        }

        public static void removeAllElements (){
            System.out.println("14. remove all the elements from a linked list:");
            List<String> colorList1 = new LinkedList<>();
            colorList1.add("Red");
            colorList1.clear();
            System.out.println("LinkedList: " + colorList1);
            System.out.println("");
        }

        public static void swapTwoElements (List colorList){
            System.out.println("15. swap two elements in a linked list:");
            Collections.swap(colorList, 0, 3);
            System.out.println("Swapped list: " + colorList);
            System.out.println("");
        }

        public static void shuffleElements (List colorList){
            System.out.println("16. shuffle the elements in a linked list:");
            Collections.shuffle(colorList);
            System.out.println("Shuffled list:" + colorList);
            System.out.println("");
        }

        public static void joinTwoLists (List colorList){
            System.out.println("17. join two linked lists:");
            LinkedList <String> newColorList = new LinkedList <> ();
            newColorList.add("DeepPink");
            System.out.println("Linked list to join: " + newColorList);

            LinkedList <String> join = new LinkedList <> ();
            join.addAll(colorList);
            join.addAll(newColorList);
            System.out.println("New linked list: " + join);
            System.out.println("");
        }

        public static void cloneTwoLists (LinkedList colorList){
            System.out.println("18. clone an linked list to another linked list:");
            LinkedList <String> clonedList = new LinkedList <> ();
            clonedList = (LinkedList)colorList.clone();
            System.out.println("Cloned linked list: " + clonedList);
            System.out.println("");
        }

        public static void removeFirstElement (LinkedList colorList){
            System.out.println("19. remove and return the first element of a linked list:");

            System.out.println("Removed element: " + colorList.pop());

            System.out.println("Linked list after pop operation: " + colorList);
            System.out.println("");
        }

        public static void retrieveFirstElement (LinkedList colorList){
            System.out.println("20.  retrieve but does not remove, the first element of a linked list:");
            String first = (String) colorList.peekFirst();
            System.out.println("First element in the list: " + first);
            System.out.println("Original linked list: " + colorList);
            System.out.println("");
        }

        public static void retrieveLastElement (LinkedList colorList){
            System.out.println("21. retrieve but does not remove, the last element of a linked list:");
            String last = (String) colorList.peekLast();
            System.out.println("First element in the list: " + last);
            System.out.println("Original linked list: " + colorList);
            System.out.println("");
        }

        public static void checkElementExists (List colorList){
            System.out.println("22. check if a particular element exists in a linked list:");
            String searchedElement = "Orange";
            if (colorList.contains(searchedElement)) {
                System.out.printf("Element '%s' is present", searchedElement);
            } else {
                System.out.printf("Element '%s' is absent", searchedElement);
            }
            System.out.println("");
            System.out.println("");
        }

        public static void convertToArrayList (List colorList){
            System.out.println("23. convert a linked list to array list:");

            List<String> list = new ArrayList<>(colorList);

            for (String str : list){
                System.out.println(str);
            }
            System.out.println("");
        }

        public static void compareTwoLists () {
            System.out.println("24. compare two linked lists:");

            LinkedList<String> colorList = new LinkedList<>();

            colorList.add("Red");
            colorList.add("Green");
            colorList.add("Black");
            colorList.add("White");
            colorList.add("Pink");
            colorList.add("Yellow");

            LinkedList<String> newColorList2= new LinkedList<>();
            newColorList2.add("Red");
            newColorList2.add("Green");
            newColorList2.add("Black");
            newColorList2.add("Orange");


            LinkedList<String> toCompare = new LinkedList<>();
            for (String e : colorList)
                toCompare.add(newColorList2.contains(e) ? "Yes" : "No");
            System.out.println(toCompare);

            System.out.println("");

        }

        public static void testListIsEmpty (LinkedList colorList) {
            System.out.println("25. test an linked list is empty or not:");
            System.out.println("Check is empty: " + colorList.isEmpty());
            colorList.removeAll(colorList);
            System.out.println("Removed!" + colorList);
            System.out.println("Check list is empty or not after removal: " + colorList.isEmpty());
            System.out.println("");
        }

        public static void replaceElement () {
            System.out.println("26. replace an element in a linked list:");
            LinkedList<String> colorList3= new LinkedList<>();
            colorList3.add("Red");
            colorList3.add("Green");
            colorList3.add("Black");
            colorList3.add("White");
            colorList3.add("Pink");
            System.out.println(colorList3);

            colorList3.set(1, "Orange");
            System.out.println("New linked list with 2nd element changed: " + colorList3);
        }

}

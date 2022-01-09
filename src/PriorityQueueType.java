import java.util.PriorityQueue;

public class PriorityQueueType {
    public static void main(String[] args) {
        PriorityQueue<String> newQueue = new PriorityQueue<>();
        newQueue.add("Red");
        newQueue.add("Green");
        newQueue.add("Orange");
        newQueue.add("White");
        newQueue.add("Black");
        System.out.println("Priority queue: " + newQueue);
        System.out.println("\niterate through all elements in priority queue: ");
        for (String element : newQueue) {
            System.out.println(element);
        }
    }
}

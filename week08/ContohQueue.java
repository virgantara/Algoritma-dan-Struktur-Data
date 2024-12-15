import java.util.LinkedList;
import java.util.Queue;

public class ContohQueue {
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<>();
		queue.add("Siti");
        queue.add("Susi");
        queue.add("Aleysha");

        System.out.println("Queue: " + queue);

	    String removedPerson = queue.poll();
        System.out.println("Removed Person: " + removedPerson);
        System.out.println("Queue after removal: " + queue);
    }
}
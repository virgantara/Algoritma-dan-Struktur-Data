import java.util.LinkedList;

public class ContohLinkedList {
    public static void main(String[] args) {
        
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Buy groceries");
        tasks.add("Complete homework");
        tasks.add("Pay bills");
		System.out.println("Task List: " + tasks);

        tasks.remove("Complete homework");
        System.out.println("After removing a task: " + tasks);
    }
}
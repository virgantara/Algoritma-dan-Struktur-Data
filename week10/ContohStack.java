import java.util.Stack;

public class ContohStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Buku 1");
        stack.push("Buku 2");
        stack.push("Buku 3");

        System.out.println("Stack: " + stack);

        // Pop an element from the stack
        String topBook = stack.pop();
        System.out.println("Popped: " + topBook);
        System.out.println("Stack after pop: " + stack);

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());
    }
}
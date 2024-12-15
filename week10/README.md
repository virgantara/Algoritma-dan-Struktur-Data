# Stack
A stack is a data structure that follows the Last-In, First-Out (LIFO) principle. Imagine a stack of books: the last book you put on the stack is the first one you take off. In a stack, you can add elements (push) to the top and remove elements (pop) from the top.

## Contoh Kode Stack
```java
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

```

## Explanation

1. `push()` adds an element to the top of the stack.
2. `pop()` removes and returns the top element.
3. `peek()` returns the top element without removing it.
4. The stack works like a stack of books: the last book you add is the first one removed.

## Output
```
Stack: [Book 1, Book 2, Book 3]  
Popped: Book 3  
Stack after pop: [Book 1, Book 2]  
Top element: Book 2
```

# Queue
A queue is a data structure that follows the First-In, First-Out (FIFO) principle. Think of a line at a ticket counter: the first person in line is the first one to get served. In a queue, you add elements (enqueue) to the back and remove elements (dequeue) from the front.

## Kode Queue
```java
import java.util.LinkedList;
import java.util.Queue;

class Antrian{
    Queue<String> queue = null;

    public Antrian(){
        this.queue = new LinkedList<>();
    }

    public void enqueue(String nama){
        this.queue.add(nama);
    }

    public void dequeue(){
        this.queue.poll();
    }

    public void lihatAntrianBerikut(){
        return this.queue.peek();
    }

    public void printIsiAntrian(){
        System.out.println("Queue: " + this.queue);
    }
}

public class ContohQueue {
    public static void main(String[] args) {
        Antrian antrian = new Antrian();

        antrian.enqueue("Siti");
        antrian.enqueue("Susi");
        antrian.enqueue("Aisyah");

        antrian.printIsiAntrian();

        String servedPerson = antrian.dequeue();
        System.out.println("Served: " + servedPerson);
        
        System.out.println("Queue after serving");
        antrian.printIsiAntrian();

        String namaBerikutnya = antrian.lihatAntrianBerikut();
        System.out.println("Next in line: " + namaBerikutnya);
    }
}
```

## Cara menjalankan kode sebelumnya
1. Buka terminal
2. Compile dulu dengan 
```bash
javac ContohQueue.java
```
3. Run dengan 
```bash
java ContohQueue
```

## Penjelasan

1. `add()` adds an element to the back of the queue.
2. `poll()` removes and returns the element from the front of the queue.
3. `peek()` returns the front element without removing it.
4. This example simulates people waiting in line: the first person added to the queue is the first one served.

## Output
```
Queue: [Siti, Susi, Aisyah]
Served: Siti
Queue after serving
Queue: [Susi, Aisyah]
Next in line: Susi
```

# Summary

1. Stack: Last-In, First-Out (LIFO). Operations: `push()`, `pop()`, `peek()`.
2. Queue: First-In, First-Out (FIFO). Operations: `add()`, `poll()`, `peek()`.

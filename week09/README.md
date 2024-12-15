# Intro to Class and Linked List
## Concept of a Class in Java
In Java, a class is a blueprint for creating objects. Think of a class like a recipe or template. Just like a recipe tells you what ingredients and steps are needed to make a dish, a class tells you what attributes (data) and behaviors (methods) an object will have.

For example, if you want to model a car, you can create a Car class. The class defines the properties of a car (like color, brand, and speed) and the actions it can perform (like driving or stopping). You can then create multiple car objects, each with different values for those properties.

## Basic Structure of a Class

Here’s a simple example of a Mobil class in Java:
```java
// Class definition
public class Mobil {
    // Attributes (data)
    String merek;
    String warna;
    int kecepatan;

    // Constructor: Initializes the car's properties
    public Mobil(String merek, String warna, int kecepatan) {
        this.merek = merek;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    // Method (behavior) to display car details
    public void displayDetails() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }

    // Method (behavior) to drive the car
    public void drive() {
        System.out.println(merek + " is driving.");
    }

    // Main method to create car objects and use the class
    public static void main(String[] args) {
        // Creating objects of the Mobil class
        Mobil mobil1 = new Mobil("Toyota", "Red", 120);
        Mobil mobil2 = new Mobil("Honda", "Blue", 150);

        // Using the objects' methods
        mobil1.displayDetails();
        mobil1.drive();

        System.out.println();

        mobil2.displayDetails();
        mobil2.drive();
    }
}

```
### Explanation of the Code

1. Class Declaration:
        `public class Mobil` defines a class named `Mobil`.

2. Attributes (Data):
        `String merek`;, `String warna;`, and `int kecepatan;` are attributes (also called fields or instance variables) that describe the properties of a car.

3. Constructor:
        `public Mobil(String merek, String warna, int kecepatan)` is a constructor used to initialize the attributes when creating a new Car object.

4. Methods (Behaviors):
        `displayDetails()` prints the car's details.
        `drive()`` prints a message that the car is driving.

5. Creating Objects:
        In the main method, `Mobil mobil1 = new Mobil("Toyota", "Red", 120);` creates an object `mobil1` of the `Mobil` class with specific values.

6. Using Methods:
        `mobil1.displayDetails()` and `mobil1.drive()`` call the methods to display the car’s details and simulate driving.

# 1. What is a Linked List?
A linked list is a collection of nodes where each node contains data and a reference (or link) to the next node. Unlike arrays, linked lists don’t need to have a fixed size, making them flexible for storing data. In a singly linked list, each node points to the next node in the sequence.

## Contoh Kode Linked List dasar
Di sini, Linked List menggunakan object yang bernama `Node`. Bayangkan `Node` itu sebagai sebuah object titik atau lingkaran. Linked List adalah kumpulan dari `Node` yang saling terhubung dan memiliki hirarki.

```java
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ContohLinkedList {
    Node head; 

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ContohLinkedList list = new ContohLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println("Linked List:");
        list.display();
    }
}
```

### Penjelasan:
1. `Node` Class: Represents each node with `data` and a `next` reference pointing to the next node.
2. `insert` Method: Adds a new node at the end of the list.
3. `display` Method: Traverses the list and prints each node’s data.
4. The list created in the `main` method contains the elements `10 -> 20 -> 30 -> null`.

## Menghapus sebuah Node dari Linked List
Menghapus node melibatkan penghapusan node dengan memperbarui link sehingga list tetap terhubung.
Kita modifikasi `class ContohLinkedList` di atas dengan menambahkan method berikut:
```java
public void delete(int key) {
    if (head == null) return;

    if (head.data == key) {
        head = head.next;
        return;
    }

    Node current = head;
    while (current.next != null && current.next.data != key) {
        current = current.next;
    }

    if (current.next == null) {
        System.out.println("Key not found!");
        return;
    }

    current.next = current.next.next;
}
```
Di bagian `main` method, kita modif dengan kode berikut:
```java
public static void main(String[] args) {
    ContohLinkedList list = new ContohLinkedList();
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);

    System.out.println("Original List:");
    list.display();

    list.delete(30);
    System.out.println("After Deleting 30:");
    list.display();
}
```

### Penjelasan:

1. The `delete` method removes the node containing the specified key.
2. If the head node contains the key, the head is updated.
3. The method traverses the list, finds the node to be deleted, and updates the link to skip the deleted node.

### Output
```
Original List:
10 -> 20 -> 30 -> 40 -> null
After Deleting 30:
10 -> 20 -> 40 -> null
```

## Traverse LinkedList
Dari tadi ngomongin traverse, apa sih traverse itu? Traverse berarti mengunjungi setiap node dalam list dan melakukan beberapa tindakan, misal mencetak data.

Kita modifikasi `class ContohLinkedList` di atas dengan menambahkan method berikut:
```java
public void traverse() {
    Node current = head;
    while (current != null) {
        System.out.print(current.data + " ");
        current = current.next;
    }
    System.out.println();
}
```

Di bagian `main` method, kita modif dengan kode berikut:
```java
public static void main(String[] args) {
    ContohLinkedList list = new ContohLinkedList();
    list.insert(5);
    list.insert(15);
    list.insert(25);

    System.out.print("Traversed List: ");
    list.traverse();
}
```

### Penjelasan
1. Metode traverse melewati setiap node dan mencetak datanya.
2. Memasukkan tiga elemen (`5`, `15`, `25`) akan menghasilkan list yang dapat ditelusuri.

### Output
```
Traversed List: 5 15 25 
```
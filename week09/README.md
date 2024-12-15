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
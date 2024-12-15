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

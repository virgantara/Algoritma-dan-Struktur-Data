public class ContohFaktorial {
    public int faktorial(int n) {
        if (n == 0) { // Base case
            return 1;
        } else {
            return n * faktorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
    	ContohFaktorial obj = new ContohFaktorial();
        int angka = 5;
        System.out.println("Faktorial dari bilangan " + angka + " adalah: " + obj.faktorial(angka));
    }
}
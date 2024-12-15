public class ContohFibonacci {

    public int fibonacci(int n) {
        if (n == 0) { // Base case 1
            return 0;
        } else if (n == 1) { // Base case 2
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
        }
    }

    public static void main(String[] args) {
    	ContohFibonacci obj = new ContohFibonacci();
        int ke = 7;
        System.out.println("Bilangan Fibonacci pada urutan " + ke + " adalah: " + obj.fibonacci(ke));
    }
}
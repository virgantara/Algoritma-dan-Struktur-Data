public class ContohArray {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40};

        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
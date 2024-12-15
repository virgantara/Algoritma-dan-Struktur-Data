public class StringContains {
    public static void main(String[] args) {
        String sentence = "I love learning Java programming.";

        if (sentence.contains("Java")) {
            System.out.println("The sentence contains 'Java'.");
        } else {
            System.out.println("The sentence does not contain 'Java'.");
        }
    }
}
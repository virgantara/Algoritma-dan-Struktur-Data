import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputanString {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = reader.readLine();

        System.out.println("Hello, " + name + "!");
    }
}
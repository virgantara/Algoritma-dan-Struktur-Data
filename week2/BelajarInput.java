import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BelajarInput{
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Inputkan namamu: ");
		String namaku = reader.readLine();

		System.out.println("Namamu adalah: "+namaku);
	}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ValidasiInput{
	public static void main(String[]args){
		
		
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Inputkan angka: ");
			int angka = Integer.parseInt(reader.readLine());
			System.out.println("Angka yang diinput adalah: "+ String.valueOf(angka));
		}

		catch(IOException e){

		}

		catch(NumberFormatException e){
			System.out.println("Input Anda salah, gunakan angka sebagai inputan");
		}
		

		
	} 
}
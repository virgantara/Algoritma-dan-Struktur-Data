import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ValidasiEmail{
	public static void main(String[]args){
		
		
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Inputkan teks: ");
			String teks = reader.readLine();

			if(teks.contains("@")){
				System.out.println("Teks mengandung @");
			}

			else{
				System.out.println("Teks tidak mengandung @");
			}
		}

		catch(IOException e){

		}

		
		
	} 
}
public class Looping{
	
	// Looping adalah perulangan
	public static void main(String [] args){
		
		// perulangan menggunakan while
		int indeks = 1;
		int angka = 1;

		while(indeks <= 5){
			angka = angka * indeks;
			indeks = indeks + 1;

			// Concatenation
			System.out.println("Angka: " + angka);
			System.out.println("Indeks: " + indeks);
		}

	}


}
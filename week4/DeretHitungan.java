public class DeretHitungan{
	public static void main(String[] args){
		
		int i = 0;
		int total = 0;
		int sampai = 3;

		int [] elemen = {0, 1, 2, 3};

		while( i <= sampai){
			total = total + elemen[i];
			i = i + 1;
		}

		System.out.println(total);

	}
}
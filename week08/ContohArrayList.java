import java.util.*;

public class ContohArrayList{

	public static void main(String[]args){
		ArrayList<Mahasiswa> daftar = new ArrayList<>();

		Mahasiswa mhs1 = new Mahasiswa();
		mhs1.nim = "123";
		mhs1.nama = "Budi";

		daftar.add(mhs1);	

		System.out.println(mhs1);
	}

}

class Mahasiswa {
	public String nim="";
	public String nama="";

	public String toString(){
		return this.nim+" "+this.nama;
	}
}

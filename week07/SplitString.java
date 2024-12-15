public class SplitString {
    public static void main(String[] args) {
        String buah = "Apel,Jeruk,Pisang,Mangga";

        String[] buahArray = buah.split(",");

        for (String buah : buahArray) {
            System.out.println(buah);
        }
    }
}
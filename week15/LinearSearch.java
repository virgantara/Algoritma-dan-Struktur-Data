public class LinearSearch {
    public int cari(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Mengembalikan indeks elemen yang ditemukan
            }
        }
        return -1; // Mengembalikan -1 jika elemen tidak ditemukan
    }

    public static void main(String[] args) {
    	LinearSearch ls = new LinearSearch();
        int[] data = {5, 3, 8, 2, 9, 1};
        int target = 8;

        int result = ls.cari(data, target);

        if (result != -1) {
            System.out.println("Elemen ditemukan di indeks: " + result);
        } else {
            System.out.println("Elemen tidak ditemukan");
        }
    }
}
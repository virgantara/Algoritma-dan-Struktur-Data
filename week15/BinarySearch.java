public class BinarySearch {
    public static int cari(int[] arr, int target) {
        int kiri = 0;
        int kanan = arr.length - 1;

        while (kiri <= kanan) {
            int tengah = (kiri + kanan) / 2;

            if (arr[tengah] == target) {
                return tengah; // Elemen ditemukan
            } else if (arr[tengah] < target) {
                kiri = tengah + 1; // Cari di bagian kanan
            } else {
                kanan = tengah - 1; // Cari di bagian kiri
            }
        }
        return -1; // Elemen tidak ditemukan
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] data = {1, 2, 3, 5, 8, 9}; // Data harus sudah terurut
        int target = 5;

        int result = bs.cari(data, target);

        if (result != -1) {
            System.out.println("Elemen ditemukan di indeks: " + result);
        } else {
            System.out.println("Elemen tidak ditemukan");
        }
    }
}
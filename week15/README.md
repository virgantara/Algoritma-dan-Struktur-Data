# Searching atau algoritma pencarian
Dalam pemrograman, algoritma pencarian digunakan untuk menemukan elemen tertentu di dalam sebuah kumpulan data (misalnya array). Dua algoritma pencarian yang paling umum adalah Linear Search (Pencarian Linear) dan Binary Search (Pencarian Biner). Berikut ini penjelasan sederhana dan contoh kode Java untuk kedua algoritma tersebut.

## Linear Search
### Definisi
Linear Search bekerja dengan cara memeriksa setiap elemen dalam array satu per satu dari awal hingga akhir. Jika elemen yang dicari ditemukan, algoritma akan berhenti dan mengembalikan posisi elemen tersebut. Linear Search sangat cocok untuk dataset kecil atau ketika data tidak terurut. Namun, untuk dataset besar, metode ini bisa menjadi lambat karena harus memeriksa semua elemen secara berurutan.

Misalnya, bayangkan Anda mencari nama teman dalam daftar yang ditulis secara acak. Anda akan memeriksa nama tersebut dari awal daftar hingga menemukan nama teman yang dicari.

### Pseudocode Linear Search
```java
Prosedur LinearSearch(arr, target):
    Untuk i dari 0 hingga panjang(arr) - 1:
        Jika arr[i] == target:
            Kembalikan i (index elemen ditemukan)
    Kembalikan -1 (jika elemen tidak ditemukan)
```

### Contoh kasus
Misalkan kita punya daftar angka `[3, 7, 1, 9, 5]` dan ingin mencari angka `9`. Linear Search akan mengecek satu per satu dari awal hingga menemukan angka `9`.

### Kode Java
```java
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
```

### Penjelasan Kode

1. `LinearSearch` adalah metode yang melakukan pencarian linear.
2. Perulangan `for` memeriksa setiap elemen dalam array.
3. Jika elemen ditemukan, indeks dikembalikan. Jika tidak ditemukan, mengembalikan `-1`.
4. Kompleksitas Waktu: `O(n)` – waktu eksekusi bertambah seiring dengan ukuran data.

## Binary Search
### Definisi

Binary Search adalah algoritma pencarian yang lebih cepat dibandingkan Linear Search, tetapi hanya bekerja jika data sudah dalam keadaan terurut. Algoritma ini bekerja dengan membagi array menjadi dua bagian di setiap langkah. Jika elemen yang dicari lebih kecil dari nilai tengah, pencarian dilanjutkan ke bagian kiri. Jika lebih besar, pencarian dilanjutkan ke bagian kanan. Proses ini diulang sampai elemen ditemukan atau tidak ada lagi elemen yang bisa diperiksa.

Bayangkan Anda mencari kata di kamus. Anda tidak akan memeriksa satu per satu dari awal, melainkan langsung membuka halaman tengah, lalu menentukan apakah kata yang dicari berada di bagian kiri atau kanan.

### Pseudocode Binary Search
```java
Prosedur BinarySearch(arr, target):
    kiri = 0
    kanan = panjang(arr) - 1

    Sementara kiri <= kanan:
        tengah = (kiri + kanan) / 2
        Jika arr[tengah] == target:
            Kembalikan tengah
        Jika arr[tengah] < target:
            kiri = tengah + 1
        Jika arr[tengah] > target:
            kanan = tengah - 1

    Kembalikan -1 (jika elemen tidak ditemukan)
```

### Contoh kasus
Misalkan kita punya daftar angka terurut `[1, 3, 5, 7, 9]` dan ingin mencari angka `7`. Binary Search akan membagi daftar menjadi dua bagian dan memeriksa bagian yang relevan, sehingga lebih cepat menemukan angka `7`.

### Kode Java Binary Search
```java
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
```

### Penjelasan Kode

1. `BinarySearch` adalah metode untuk melakukan pencarian biner.
2. Variabel `kiri` dan `kanan` digunakan untuk menentukan rentang pencarian.
3. Variabel `tengah` digunakan untuk memeriksa elemen di tengah array.
4. Jika elemen di tengah cocok dengan target, indeks dikembalikan.
5. Jika elemen lebih kecil dari target, pencarian dilanjutkan di sebelah kanan. Sebaliknya, jika lebih besar, pencarian dilanjutkan di sebelah kiri.
6. Kompleksitas Waktu: `O(log n)` – lebih efisien dibandingkan Linear Search untuk dataset besar.

### Output
```bash
Elemen ditemukan di indeks: 3
```
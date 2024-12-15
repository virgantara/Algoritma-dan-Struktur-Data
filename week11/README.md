# Rekursi
Rekursi adalah teknik dalam pemrograman di mana fungsi memanggil dirinya sendiri untuk menyelesaikan masalah. Dari pada menggunakan loop, rekursi memecah masalah menjadi sub-masalah yang lebih kecil dan menyelesaikan setiap sub-masalah dengan memanggil fungsi itu lagi. Fungsi rekursif memiliki dua bagian: `base case` (yang menghentikan rekursi) dan `recursive case` (yang memanggil fungsi lagi). Rekursi berguna untuk memecahkan masalah yang secara alami terurai menjadi beberapa contoh yang lebih kecil dari masalah yang sama, seperti menghitung faktorial, menghasilkan angka Fibonacci, dan melintasi struktur data seperti pohon.

Saat menggunakan rekursi, penting untuk menentukan kasus dasar untuk mencegah perulangan yang tak terbatas. `base case` adalah kondisi di mana fungsi berhenti memanggil dirinya sendiri. `recursive case` adalah di mana fungsi melakukan beberapa komputasi dan kemudian memanggil dirinya sendiri dengan input yang dimodifikasi. 

## 1. Contoh: Menghitung bilangan faktorial
Faktorial dari bilangan bulat non-negatif `n` (dilambangkan dengan `n!`) adalah hasil kali semua bilangan bulat positif sampai dengan `n`. Sebagai contoh, `5! = 5 × 4 × 3 × 2 × 1 = 120`. Dalam rekursi, faktorial dari `n` dapat didefinisikan sebagai `n * faktorial (n - 1)`, dengan kasus dasarnya adalah `faktorial(0) = 1`.

Berikut ini contoh kodenya di Java:
```java
public class ContohFaktorial {
    public int faktorial(int n) {
        if (n == 0) { // Base case
            return 1;
        } else {
            return n * faktorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
    	ContohFaktorial obj = new ContohFaktorial();
        int angka = 5;
        System.out.println("Faktorial dari bilangan " + angka + " adalah: " + obj.faktorial(angka));
    }
}
```

### Penjelasan

1. Base Case: ketika `n` bernilai `0`, maka return `1` (karena `0! = 1`).
2. Recursive Case: `faktorial(n)` adalah `n * faktorial(n - 1)`.
3. Fungsi memanggil dirinya sendiri dengan `n - 1` hingga mencapai base case.

### Output
```bash
Faktorial dari bilangan 5 adalah: 120
```
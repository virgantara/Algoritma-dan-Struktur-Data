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

## 2. Contoh: Memunculkan deret bilangan Fibonacci
Deret Fibonacci adalah serangkaian angka di mana setiap angka adalah jumlah dari dua angka sebelumnya. Deret ini dimulai dengan `0` dan `1`. Sebagai contoh, enam angka Fibonacci pertama adalah `0, 1, 1, 2, 3, 5`. Dengan menggunakan rekursi, angka Fibonacci pada posisi `n` dapat didefinisikan sebagai `fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2)`, dengan kasus dasar `fibonacci(0) = 0` dan `fibonacci(1) = 1`.

Berikut contoh kodenya:
```java
public class ContohFibonacci {

    public int fibonacci(int n) {
        if (n == 0) { // Base case 1
            return 0;
        } else if (n == 1) { // Base case 2
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
        }
    }

    public static void main(String[] args) {
    	ContohFibonacci obj = new ContohFibonacci();
        int ke = 6;
        System.out.println("Bilangan Fibonacci pada urutan " + ke + " adalah: " + obj.fibonacci(ke));
    }
}
```

### Penjelasan

1. Base Cases: `fibonacci(0) = 0` and `fibonacci(1) = 1`.
2. Recursive Case: `fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2)`.
### Output
```bash
Bilangan Fibonacci pada urutan 7 adalah: 13
```

## 3. Studi Kasus: Menjumlahkan deret angka
Anda juga dapat menggunakan rekursi untuk menghitung jumlah bilangan asli dari `1` hingga `n`. Misalnya, jumlah dari 4 bilangan asli pertama adalah `1 + 2 + 3 + 4 = 10`. Pendekatan rekursif adalah mendefinisikan jumlah `n` sebagai `n + jumlah (n - 1)` dengan kasus dasar adalah `jumlah(0) = 0`.

### Soal
1. Buatlah kodenya dengan secara rekursif dengan Java
2. Berikan input bilangan ke-n
### Output harapan
```bash
Jumlah bilangan asli dari 1 hingga 4 adalah: 10
```

# Rangkuman Poin-Poin Penting

1. Rekursi adalah sebuah fungsi yang memanggil dirinya sendiri untuk menyelesaikan masalah yang lebih kecil.
2. Setiap fungsi rekursif membutuhkan kasus dasar untuk menghentikan rekursi dan kasus rekursif untuk melanjutkan pemanggilan fungsi.
3. Contoh-contoh seperti perhitungan faktorial, deret Fibonacci, dan jumlah bilangan asli adalah masalah klasik yang mudah dipahami oleh pemula untuk memahami rekursi.
4. Rekursi dapat menyederhanakan kode untuk masalah yang secara alami terurai menjadi beberapa contoh yang lebih kecil dari masalah yang sama.

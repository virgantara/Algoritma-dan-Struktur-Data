# Multi-dimensional Arrays and Matrix Operations

## 1. Definition:
Array multi-dimensi adalah array dengan lebih dari satu tingkat atau dimensi. Jenis yang paling umum adalah array 2D (array dua dimensi), yang seperti tabel dengan baris dan kolom.

Contoh array multidimensi:
```java
int[][] numbers = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
}
```

Contoh ini mencerminkan sebuah array berikut:
```
1  2  3  
4  5  6  
7  8  9 
```

## 2. Mengakses elemen array 2D
```java
public class ContohArray2D {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("Elemen pada baris ke-1 dan kolom ke-2: " + matrix[1][2]);
    }
}
```

### Penjelasan
`matrix[1][2]`  berarti elemen pada baris ke-2 (indeks 1) dan kolom ke-3 (indeks 2)

## 3. Perulangan pada Array 2D 
```java
public class ContohPerulangan {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
```

Potongan kode sebelumnya akan menghasilkan output berikut:
```
1 2 3  
4 5 6  
7 8 9  
```

### Penjelasan
1. Perulangan luar mengulang setiap baris (i).
2. Perulangan dalam mengulang setiap kolom (j) dalam baris saat ini.
3. System.out.print mencetak setiap elemen pada baris yang sama.
4. System.out.println() berpindah ke baris berikutnya setelah setiap baris.

## 4. Penjumlahan Matrix
```java
public class PenjumlahanMatrix {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2},
            {3, 4}
        };

        int[][] matrixB = {
            {5, 6},
            {7, 8}
        };

        int[][] hasil = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
Potongan kode di atas akan menghasilkan:
```
6 8  
10 12  
```

### Penjelasan
1. Kita menambahkan elemen-elemen yang sesuai dari `matriksA` dan `matriksB` untuk mendapatkan matriks `hasil`.
2. `hasil[i][j] = matriksA[i][j] + matriksB[i][j];` menambahkan elemen-elemen pada baris dan kolom yang sama.

## Kesimpulan

1. Array 2D seperti tabel dengan baris dan kolom.
2. Anda mengakses elemen menggunakan `array[baris][kolom]`.
3. Operasi dasar meliputi traverse, addition, dan transpose.

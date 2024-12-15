# Sorting atau Pengurutan
Sorting (pengurutan) adalah proses menyusun elemen-elemen dalam suatu kumpulan data berdasarkan urutan tertentu, seperti dari kecil ke besar (ascending) atau dari besar ke kecil (descending). Sorting penting karena membantu mempercepat pencarian data, mengorganisir informasi, dan mempermudah analisis data. Contoh sederhana adalah menyusun nilai ujian siswa dari yang tertinggi ke terendah.

## Contoh 1: Bubble Sort

Bubble Sort adalah algoritma sorting sederhana yang bekerja dengan membandingkan dua elemen yang berdampingan dan menukarnya jika urutannya salah. Proses ini diulang sampai semua elemen dalam posisi yang benar. Bayangkan gelembung (bubble) naik ke permukaan air; elemen terbesar akan "menggelembung" ke posisi terakhir.

### Pseudocode
```yaml
Mulai dari elemen pertama hingga elemen terakhir:
    Untuk setiap elemen dalam array (kecuali elemen terakhir yang sudah diurutkan):
        Bandingkan elemen sekarang dengan elemen berikutnya.
        Jika elemen sekarang lebih besar dari elemen berikutnya:
            Tukar posisi kedua elemen tersebut.
    Ulangi proses sampai tidak ada lagi pertukaran yang terjadi.
```
```less
Prosedur BubbleSort(arr):
    Untuk i dari 0 hingga panjang(arr) - 2:
        Untuk j dari 0 hingga panjang(arr) - i - 2:
            Jika arr[j] > arr[j + 1]:
                Tukar arr[j] dengan arr[j + 1]
```
### Contoh
- Contoh Array: `[5, 2, 9, 1, 6]`
- Hasil Setelah Iterasi: `[2, 5, 1, 6, 9]` > `[2, 1, 5, 6, 9]` > `[1, 2, 5, 6, 9]`

## Contoh 2: Selection Sort
Selection Sort bekerja dengan mencari elemen terkecil (atau terbesar) di antara elemen-elemen yang belum diurutkan dan memindahkannya ke posisi yang benar. Bayangkan Anda sedang memilih buah apel di pasar; Anda akan mengambil apel terkecil satu per satu dan menyusunnya di keranjang.

### Pseudocode Selection Sort
```markdown
Untuk setiap posisi dari awal hingga elemen terakhir:
    Cari elemen terkecil dari bagian yang belum diurutkan.
    Tukar elemen terkecil tersebut dengan elemen di posisi saat ini.
```
```less
Prosedur SelectionSort(arr):
    Untuk i dari 0 hingga panjang(arr) - 2:
        minIndex = i
        Untuk j dari i + 1 hingga panjang(arr) - 1:
            Jika arr[j] < arr[minIndex]:
                minIndex = j
        Tukar arr[i] dengan arr[minIndex]
```

## Contoh 3: Insertion Sort
Insertion Sort bekerja dengan membangun daftar yang terurut satu per satu. Pada setiap langkah, elemen baru dimasukkan ke posisi yang tepat di bagian yang sudah terurut. Bayangkan Anda sedang menyusun kartu remi di tangan; Anda akan mengambil satu kartu dan menempatkannya di posisi yang benar.

### Pseudocode Insertion Sort
```arduino
Untuk setiap elemen dari posisi kedua hingga terakhir:
    Ambil elemen saat ini sebagai "key".
    Bandingkan "key" dengan elemen di sebelah kiri.
    Geser elemen-elemen yang lebih besar dari "key" ke kanan.
    Letakkan "key" di posisi yang tepat.
```

```less
Prosedur InsertionSort(arr):
    Untuk i dari 1 hingga panjang(arr) - 1:
        key = arr[i]
        j = i - 1
        Sementara j >= 0 dan arr[j] > key:
            arr[j + 1] = arr[j]
            j = j - 1
        arr[j + 1] = key

```

## Kesimpulan

1. Bubble Sort: Mengurutkan dengan cara membandingkan dan menukar elemen yang berdampingan berulang kali sampai semua elemen terurut.
2. Selection Sort: Mengurutkan dengan memilih elemen terkecil dari bagian yang belum diurutkan dan menukarnya dengan elemen di posisi awal.
3. Insertion Sort: Mengurutkan dengan menyisipkan elemen ke posisi yang benar dalam bagian yang sudah terurut.

## Bonus: Contoh Kode Java Bubble Sort
```java
public class BubbleSort {
    public void urutkan(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Tukar elemen jika elemen sekarang lebih besar dari elemen berikutnya
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
    	BubbleSort bs = new BubbleSort();
        int[] data = {5, 2, 9, 1, 5, 6};
        System.out.println("Array sebelum sorting:");
        for (int num : data) {
            System.out.print(num + " ");
        }

        bs.urutkan(data);

        System.out.println("\nArray setelah sorting:");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
```
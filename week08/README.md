# Introduction to Data Structures

## Learning Objectives:

1. Understand the concept of data structures and their importance.
2. Explore different types of data structures like arrays, linked lists, stacks, and queues.
3. Identify suitable data structures for specific problems.

## What is a Data Structure?
Struktur data adalah cara untuk menyimpan dan mengatur data dalam komputer sehingga dapat digunakan secara efisien. Bayangkan Anda memiliki koleksi buku. Jika Anda menumpuknya secara acak, menemukan buku tertentu membutuhkan waktu lama. Tetapi jika Anda mengaturnya dengan rapi di rak berdasarkan abjad atau kategori, menemukan buku menjadi cepat dan mudah. Demikian pula dalam pemrograman, kita menggunakan struktur data seperti array, linked list, stack, dan queue untuk mengatur dan mengakses data secara lebih efektif.

## Example: Arrays
`Array` adalah struktur data dasar yang menyimpan beberapa nilai dengan tipe yang sama dalam satu variabel. Anda dapat membayangkan `Array` sebagai deretan kotak surat di mana setiap kotak menyimpan sebuah data. Sebagai contoh, `int[] numbers = {10, 20, 30, 40};` membuat sebuah Array dengan empat angka. Untuk mengakses angka kedua, Anda menggunakan `numbers[1]` (ingat, indeks larik dimulai dari 0). `Array` berguna ketika Anda mengetahui jumlah elemen sebelumnya dan membutuhkan akses cepat ke setiap elemen berdasarkan posisinya.

### Contoh Array
```java
public class ContohArray {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40};

        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
```

## Example: Linked Lists
`Linked List` adalah sebuah urutan elemen di mana setiap elemen menunjuk ke elemen berikutnya. Bayangkan sebuah rantai di mana setiap mata rantai (node) menyimpan sepotong data dan penunjuk ke mata rantai berikutnya. Tidak seperti Array, Linked List tidak membutuhkan ukuran tetap, sehingga fleksibel untuk menyimpan data yang bertambah atau berkurang. Sebagai contoh, jika Anda memiliki daftar tugas, setiap tugas dapat menjadi simpul yang menunjuk ke tugas berikutnya. Anda dapat dengan mudah menambah atau menghapus tugas tanpa mengatur ulang seluruh daftar, yang lebih sulit dilakukan dengan Array.

### Contoh Linked List
```java
import java.util.LinkedList;

public class ContohLinkedList {
    public static void main(String[] args) {
        
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Buy groceries");
        tasks.add("Complete homework");
        tasks.add("Pay bills");
		System.out.println("Task List: " + tasks);

        tasks.remove("Complete homework");
        System.out.println("After removing a task: " + tasks);
    }
}
```
### Penjelasan
1. Kita membuat LinkedList untuk menyimpan `tasks`.
2. Kita dapat dengan mudah menambah atau menghapus `tasks` tanpa mengkhawatirkan ukurannya.
3. Metode hapus menghapus `tasks` berdasarkan nilainya.

## Example: Stacks
`Stack` adalah struktur data yang mengikuti prinsip Last-In, First-Out (LIFO). Bayangkan `Stack` sebagai tumpukan piring: piring terakhir yang Anda letakkan di atas adalah piring pertama yang Anda lepaskan. Dalam pemrograman, tumpukan digunakan untuk mengelola tugas-tugas di mana tindakan terakhir harus dibatalkan terlebih dahulu, seperti fitur Undo dalam editor teks. Operasi dalam Stack disebut `Push` (menambahkan elemen) dan `Pop` (menghapus elemen). 

### Contoh Stacks
```java
import java.util.Stack;

public class ContohStack {
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        int poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);
    }
}
```

### Penjelasan
1. Metode `push` menambahkan elemen ke bagian atas tumpukan.
2. Metode `pop` menghapus dan mengembalikan elemen teratas.
3. Elemen terakhir yang ditambahkan adalah elemen pertama yang dihapus.

## Example: Queues
Queue mengikuti prinsip First-In, First-Out (FIFO). Bayangkan sebuah barisan orang yang sedang menunggu bus: orang pertama dalam antrean adalah orang pertama yang akan naik ke dalam bus. Dalam pemrograman, antrean digunakan ketika tugas perlu diproses sesuai urutan kedatangannya, seperti menangani pekerjaan cetak di printer. Anda menggunakan `enqueue` untuk menambahkan elemen ke akhir antrean dan `dequeue` untuk menghapus elemen di bagian depan. 

### Contoh Queue
```java
import java.util.LinkedList;
import java.util.Queue;

public class ContohQueue {
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<>();
		queue.add("Siti");
        queue.add("Susi");
        queue.add("Aleysha");

        System.out.println("Queue: " + queue);

	    String removedPerson = queue.poll();
        System.out.println("Removed Person: " + removedPerson);
        System.out.println("Queue after removal: " + queue);
    }
}
```

### Penjelasan
1. Metode `add` menambahkan elemen ke akhir antrean.
2. Metode `poll` menghapus dan mengembalikan elemen di bagian depan antrean.
3. Elemen pertama yang ditambahkan adalah elemen pertama yang dihapus.
# Graph

## Pengenalan Graph dan Traversal dalam Pemrograman
Dalam ilmu komputer, Graph adalah struktur data yang digunakan untuk merepresentasikan hubungan antar objek. Graph terdiri dari simpul (node/vertex) dan sisi (edge). Bayangkan peta kota dengan simpul sebagai titik kota dan sisi sebagai jalan yang menghubungkan kota-kota tersebut. Graph banyak digunakan dalam berbagai aplikasi seperti jaringan komputer, sistem navigasi, dan media sosial.

Traversal (penelusuran) adalah proses mengunjungi setiap simpul dalam graph. Dua metode traversal yang umum digunakan adalah BFS (Breadth-First Search) dan DFS (Depth-First Search). BFS menelusuri simpul-simpul yang berdekatan terlebih dahulu sebelum menjelajah lebih dalam, sedangkan DFS menelusuri satu jalur sedalam mungkin sebelum kembali ke jalur lainnya. Memahami traversal ini sangat berguna untuk menyelesaikan masalah seperti pencarian rute terpendek dan pengecekan konektivitas antar simpul.

## Contoh 1: Representasi Graph dengan Adjacency List
Adjacency List adalah cara merepresentasikan graph menggunakan daftar (list). Setiap simpul memiliki daftar simpul-simpul tetangganya.

Berikut contoh kodenya
```java
import java.util.*;

public class GraphAdjacencyList {
    private Map<Integer, List<Integer>> graph;

    public GraphAdjacencyList() {
        graph = new HashMap<>();
    }

    // Menambahkan sisi ke graph
    public void addEdge(int source, int destination) {
        graph.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        graph.computeIfAbsent(destination, k -> new ArrayList<>()).add(source); // Untuk graph tak berarah
    }

    // Menampilkan graph
    public void displayGraph() {
        for (int node : graph.keySet()) {
            System.out.println("Node " + node + " terhubung ke: " + graph.get(node));
        }
    }

    public static void main(String[] args) {
        GraphAdjacencyList graph = new GraphAdjacencyList();
        
        // Menambahkan sisi (hubungan) antar simpul
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        // Menampilkan graph
        graph.displayGraph();
    }
}
```

### Penjelasan

Dalam kode ini:

1. `addEdge` menambahkan hubungan antara dua simpul.
2. Graph disimpan dalam `Map`, di mana kunci adalah simpul dan nilai adalah daftar simpul yang terhubung dengannya.
3. Metode `displayGraph` menampilkan semua simpul beserta tetangganya.

### Output
```bash
Node 1 terhubung ke: [2, 3]  
Node 2 terhubung ke: [1, 4]  
Node 3 terhubung ke: [1, 4]  
Node 4 terhubung ke: [2, 3, 5]  
Node 5 terhubung ke: [4]
```

## Contoh 2: Traversal Graph Menggunakan BFS
BFS (Breadth-First Search) adalah algoritma penelusuran pada struktur data graph atau tree yang menjelajahi simpul-simpul (node) dalam urutan mendatar atau melebar. BFS menggunakan struktur data antrian (queue) untuk menyimpan node yang akan dikunjungi. BFS cocok digunakan untuk mencari jalur terpendek dalam graph yang tidak berbobot (unweighted graph).

### Logika dan Langkah-langkah BFS:
1. Inisialisasi:
- Siapkan antrian untuk menyimpan node yang akan dikunjungi.
- Siapkan set atau array untuk menandai node yang sudah dikunjungi agar tidak dikunjungi dua kali.
2. Masukkan node awal ke dalam antrian dan tandai node tersebut sebagai dikunjungi.
3. Selama antrian tidak kosong:
- Dequeue node dari depan antrian.
- Kunjungi node tersebut (misalnya, cetak nilainya).
- Masukkan semua node tetangga yang belum dikunjungi ke dalam antrian (enqueue) dan tandai sebagai dikunjungi.

4. Ulangi proses ini sampai antrian kosong.

### Pseudocode
```arduino
BFS(G, start):
    queue = empty queue
    visited = empty set

    enqueue start ke queue
    tandai start sebagai dikunjungi

    while queue tidak kosong:
        node = dequeue dari queue
        proses node (misalnya, cetak node)

        for setiap neighbor (tetangga) dari node:
            if neighbor belum dikunjungi:
                enqueue neighbor ke queue
                tandai neighbor sebagai dikunjungi
```

### Ilustrasi BFS
Misalkan kita memiliki graph dengan simpul-simpul dan sisi seperti ini:
```lua
    1
   / \
  2   3
  |   |
  4---5
```
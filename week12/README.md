# Tree

## Pengenalan Konsep Tree dalam Pemrograman

Dalam ilmu komputer, Tree (pohon) adalah struktur data hierarkis yang digunakan untuk merepresentasikan data dalam bentuk cabang-cabang seperti pohon. Tree terdiri dari node (simpul) yang dihubungkan oleh edge (garis penghubung). Setiap node memiliki satu induk (parent) dan bisa memiliki beberapa anak (child). Node paling atas disebut root (akar), dan node yang tidak memiliki anak disebut leaf (daun). Tree sering digunakan untuk mengorganisir data seperti file sistem, struktur organisasi, dan basis data.

Salah satu jenis tree yang paling sering digunakan adalah Binary Search Tree (BST). Dalam BST, setiap node memiliki paling banyak dua anak: kiri dan kanan. Node di sebelah kiri memiliki nilai lebih kecil dari induknya, sedangkan node di sebelah kanan memiliki nilai lebih besar. BST mempermudah proses pencarian, penambahan, dan penghapusan data.

## Contoh Binary Search Tree dalam Java
Kode Java untuk Membuat dan Menampilkan Binary Search Tree
```java
class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

public class BinarySearchTree {
    Node root;

    // Metode untuk menambahkan node ke BST
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    // Metode untuk menampilkan tree secara inorder (kiri, induk, kanan)
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Menambahkan elemen ke dalam BST
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // Menampilkan elemen secara inorder
        System.out.println("Traversal inorder dari BST:");
        tree.inorder();
    }
}
```

### Penjelasan Singkat

1. `Node` Class:
    Kelas `Node` digunakan untuk merepresentasikan setiap simpul di BST. Setiap node memiliki `value`, `left` (anak kiri), dan `right` (anak kanan).

2. Metode `insert`:
    Metode ini menambahkan elemen baru ke dalam BST sesuai dengan aturan BST: elemen lebih kecil di kiri, dan elemen lebih besar di kanan.

3. Metode `inorder`:
    Traversal `inorder` mencetak elemen BST secara berurutan dari yang terkecil ke terbesar.

4. Main Method:
    Di metode `main`, kita membuat BST dan menambahkan beberapa elemen (`50`, `30`, `70`, dll.). Hasil traversal inorder akan mencetak elemen secara berurutan.

### Output
```bash
Traversal inorder dari BST:  
20 30 40 50 60 70 80
```

## Mengapa Menggunakan BST?

1. BST memungkinkan pencarian elemen dengan cepat karena kita bisa membagi pencarian menjadi dua bagian pada setiap langkah. Jika elemen yang dicari lebih kecil dari node saat ini, kita hanya perlu mencari di subtree kiri, dan sebaliknya.

2. Menambah atau menghapus data di BST lebih efisien dibandingkan dengan struktur data linear seperti array atau linked list, terutama untuk dataset yang besar.

3. Ada beberapa cara untuk menelusuri BST:
- Inorder: Mengunjungi node kiri, induk, lalu kanan (menghasilkan data berurutan).
- Preorder: Mengunjungi induk, kiri, lalu kanan.
- Postorder: Mengunjungi kiri, kanan, lalu induk.
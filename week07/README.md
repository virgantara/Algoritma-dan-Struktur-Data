# What is a String?
A string in Java is a sequence of characters. In Java, strings are objects of the `String` class.

## Declaring a String
```java
String greeting = "Hello, World!";
```

## Contoh 1: Menggunakan inputan dari user untuk String

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputanString {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = reader.readLine();

        System.out.println("Hello, " + name + "!");
    }
}
```

### Explanation
1. BufferedReader is used to take string input.
2. reader.readLine() reads the input string.
3. The input is stored in the variable name.

### Output
```
Enter your name: Budi  
Hello, Budi!
```

## Contoh 2: Mengetahui panjang karakter dari String
```java
public class StringLength {
    public static void main(String[] args) {
        String message = "Hello, Java!";
        System.out.println("The length of the string is: " + message.length());
    }
}
```

`message.length()` menhasilkan nilai keluaran (return value) berupa angka yang mencerminkan panjang dari String
### Output
```
The length of the string is: 12
```

## Contoh 3: Penggabungan String atau String Concatenation
```java
public class StringConcat {
    public static void main(String[] args) {
        String firstName = "Bejo";
        String lastName = "Sugiantoro";

        String fullName = firstName + " " + lastName;
        System.out.println("Nama Lengkap: " + fullName);

        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println("Nama Lengkap hasil concat: " + fullName2);
    }
}
```

### Penjelasan
1. Concatenation berarti mengkombinasi	 strings.
2. Operator Tambah (`+`) dan `concat()` adalah dua cara untuk menggabungkan strings.

### Output
```
Nama Lengkap: Bejo Sugiantoro  
Nama Lengkap hasil concat: Bejo Sugiantoro
```

## Contoh 4: Mengecek apakah sebuah String mengandung sebuah kata
```java
public class StringContains {
    public static void main(String[] args) {
        String sentence = "I love learning Java programming.";

        if (sentence.contains("Java")) {
            System.out.println("The sentence contains 'Java'.");
        } else {
            System.out.println("The sentence does not contain 'Java'.");
        }
    }
}
```
Fungsi `contains()` mengecek apakah string mengandung kata tertentu.
### Output
```
The sentence contains 'Java'.
```

## Contoh 5: Memecah String (split)
```java
public class SplitString {
    public static void main(String[] args) {
        String buah = "Apel,Jeruk,Pisang,Mangga";

        String[] buahArray = buah.split(",");

        for (String buah : buahArray) {
            System.out.println(buah);
        }
    }
}
```

`split()` memecah string menjadi sebuah array substring berdasarkan delimiter (pemisah).
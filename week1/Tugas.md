## Tugas 1: Introduction to Java Programming
To create a Java console application that collects and displays personal data from the user using BufferedReader for input handling.

## Instruksi
Buatlah sebuah program dengan Java yang meminta user untuk informasi berikut:
- Nama (String)
- Usia (Integer)
- Email (String)

Program yang dibuat harus memunculkan informasi yang diinputkan oleh user.

## Persyaratan
- Gunakan `BufferedReader` untuk menerima input dari user
- Validasi bahwa usia adalah angka dengan tipe data Integer (int). Jika input bukan angka atau int, maka program harus memunculkan pesan bahwa user harus memasukkan angka yang benar
- Format output yang rapi.

## Contoh output
```bash
Inputkan namamu: Budi
Inputkan usiamu: 21
Inputkan emailmu: budi@gmail.com

--- Informasi Pribadi ---
Nama: Budi
Usia: 21 tahun
Email: budi@gmail.com 
```

## Tambahan
- cek validasi email dengan cara mengecek apakah ada tanda "@" di teks/String yang diinputkan user
- lihat file [ValidasiInput.java](ValidasiInput.java) untuk contoh cek angka
- lihat file [ValidasiEmail.java](ValidasiEmail.java) untuk contoh cek email
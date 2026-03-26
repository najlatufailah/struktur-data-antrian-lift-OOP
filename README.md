### Deskripsi Kasus

Program ini dibuat untuk mensimulasikan sistem antrian lift pada sebuah gedung tower sains.
Setiap orang yang datang akan masuk ke dalam antrian, kemudian lift akan mengangkut penumpang sesuai kapasitas yang tersedia.
Lift hanya dapat menampung maksimal 10 orang dalam satu perjalanan. Setelah penuh atau tidak ada antrian, lift akan berjalan dan menurunkan penumpang sesuai lantai tujuan masing-masing.
Lantai yang digunakan dalam simulasi adalah lantai 3, 5, dan 6.

### Diagram Mermaid.AI

<img width="1745" height="3445" alt="lift antrian oop" src="https://github.com/user-attachments/assets/489aa47e-34fb-406a-840a-eec0668424ed" />

### Output Program

<img width="335" height="190" alt="output program" src="https://github.com/user-attachments/assets/8a01936d-6307-4ef5-b298-e16a4c7688d2" />

### Prinsip OOP yang digunakan

**1. Encapsulation**

Setiap atribut pada class dibuat `private` dan diakses melalui method (getter/setter).

**2. Class dan Object**

Program terdiri dari beberapa class seperti `Orang`, `Lift`, `Antrian`, dan `Gedung` yang merepresentasikan objek di dunia nyata.

**3. Constructor**

Digunakan untuk menginisialisasi objek saat pertama kali dibuat.

**4. Interaksi Antar Object**

Object saling berinteraksi:

* `Orang` masuk ke `Antrian`
* `Antrian` diproses oleh `Lift`
* `Lift` berada dalam `Gedung`

### keunikan Program

Mengambil kejadian nyata hari-hari, yaitu mengantri lift di tower 1 untuk melanjutkan kelas SKPB 

### Deskripsi Kasus

Program ini dibuat untuk mensimulasikan sistem antrian lift pada sebuah gedung tower sains.
Setiap orang yang datang akan masuk ke dalam antrian, kemudian lift akan mengangkut penumpang sesuai kapasitas yang tersedia.
Lift hanya dapat menampung maksimal 10 orang dalam satu perjalanan. Setelah penuh atau tidak ada antrian, lift akan berjalan dan menurunkan penumpang sesuai lantai tujuan masing-masing.
Lantai yang digunakan dalam simulasi adalah lantai 3, 5, dan 6.

### Diagram Mermaid.AI

<img width="1745" height="3445" alt="lift antrian oop" src="https://github.com/user-attachments/assets/489aa47e-34fb-406a-840a-eec0668424ed" />


### Kode Program

**1. Class Orang**

Class Orang digunakan untuk merepresentasikan penumpang lift.
Setiap objek memiliki:
* nama → nama penumpang
* lantaiTujuan → lantai yang dituju

Menggunakan encapsulation karena atribut dibuat private dan diakses melalui getter/setter.
```c
class Orang {
    private String nama;
    private int lantaiTujuan;

    // constructor
    public Orang(String nama, int lantaiTujuan) {
        this.nama = nama;
        this.lantaiTujuan = lantaiTujuan;
    }

    // getter
    public String getNama() {
        return nama;
    }

    public int getLantaiTujuan() {
        return lantaiTujuan;
    }

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setLantaiTujuan(int lantaiTujuan) {
        this.lantaiTujuan = lantaiTujuan;
    }
}
```
**2. Class Antrian**  
Class Antrian digunakan untuk menyimpan orang yang menunggu lift.

Konsep yang digunakan:
* Queue (FIFO - First In First Out)
* Array of object (Orang[])
  
Method:
* tambahOrang() → menambahkan orang ke antrian
* ambilOrang() → mengambil orang dari depan
* masihAda() → mengecek apakah antrian masih ada
```c
class Antrian {
    private Orang[] data = new Orang[10];
    private int depan = 0;
    private int belakang = 0;

    public void tambahOrang(Orang penumpang) {
        data[belakang] = penumpang;
        belakang++;
        System.out.println(penumpang.getNama() + " masuk antrian");
    }

    public Orang ambilOrang() {
        if (depan < belakang) {
            Orang penumpang = data[depan];
            depan++;
            return penumpang;
        }
        return null;
    }

    public boolean masihAda() {
        return depan < belakang;
    }
}
```
**3. Class Lift**  

Class Lift bertugas untuk menagngkut dan menurunkan penumpang  
Fungsi utama:
* AngkutOrang() → mengambil orang dari antrian sampai kapasitas penuh
* jalan() → mensimulasikan lift berjalan dan penumpang turun

```c
class Lift {
    private int kapasitas = 10;
    private Orang[] daftarPenumpang = new Orang[10]; // ganti nama array
    private int jumlah = 0;

    public void angkutOrang(Antrian antrian) {
        while (jumlah < kapasitas && antrian.masihAda()) {
            Orang penumpang = antrian.ambilOrang(); // object

            daftarPenumpang[jumlah] = penumpang; // simpan ke array
            jumlah++;

            System.out.println("Angkut " + penumpang.getNama() +
                " ke lantai " + penumpang.getLantaiTujuan());
        }
    }

    public void jalan() {
        if (jumlah > 0) {
            System.out.println("Lift berjalan...");
            System.out.println("=== Penumpang turun ===");

            for (int i = 0; i < jumlah; i++) {
                System.out.println(
                    daftarPenumpang[i].getNama() +
                    " turun di lantai " +
                    daftarPenumpang[i].getLantaiTujuan()
                );
            }

            jumlah = 0; // reset
        }
    }
}
```

**4. Class Gedung**
Class gedung memiliki objel Lift

```c
class Gedung {
    private Lift lift = new Lift();

    public Lift getLift() {
        return lift;
    }
}
```
**5. Class Main**
Class Main program utama

Alur :
*Membuat objek Gedung dan Antrian
*Membuat beberapa objek Orang
*Menambahkan orang ke antrian
*Menjalankan lift
```c
public class Main {
    public static void main(String[] args) {

        Gedung gedung = new Gedung();
        Antrian antrian = new Antrian();

        // buat object (ini sesuai modul)
        Orang penumpang1 = new Orang("A", 3);
        Orang penumpang2 = new Orang("B", 5);
        Orang penumpang3 = new Orang("C", 6);

        // masuk antrian
        antrian.tambahOrang(penumpang1);
        antrian.tambahOrang(penumpang2);
        antrian.tambahOrang(penumpang3);

        // lift jalan
        gedung.getLift().angkutOrang(antrian);
        gedung.getLift().jalan();
    }
}
```








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

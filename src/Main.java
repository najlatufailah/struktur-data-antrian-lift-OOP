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
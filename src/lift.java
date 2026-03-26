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
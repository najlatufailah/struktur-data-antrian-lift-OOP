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
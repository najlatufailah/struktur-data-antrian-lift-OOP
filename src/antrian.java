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
class Karyawan {
    // Protected agar bisa diakses subclass
    protected String nama;
    protected double gajiPokok;

    // Constructor
    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    void tampilInfo() {
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok);
    }
}
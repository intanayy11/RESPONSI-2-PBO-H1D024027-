class Manajer extends Karyawan {
    double tunjangan;

    // Constructor
    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok); // Panggil constructor parent
        this.tunjangan = tunjangan;
    }

    @Override
    void tampilInfo() {
        // Tampilkan info dasar + tunjangan + total
        double total = gajiPokok + tunjangan;
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok + " | Tunjangan: Rp " + tunjangan);
        System.out.println("Total Pendapatan: Rp " + total);
    }
}
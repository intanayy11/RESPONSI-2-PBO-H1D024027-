class BarangMusik {
    // Variabel
    String kode;
    String nama;
    double harga;
    int stok;

    // Constructor 1: Hanya kode dan nama
    public BarangMusik(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.harga = 0.0;
        this.stok = 0;
    }

    // Constructor 2: Kode, nama, harga
    public BarangMusik(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = 0;
    }

    // Constructor 3: Lengkap
    public BarangMusik(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    void ubahHarga(double hargaBaru) {
        this.harga = hargaBaru;
    }

    void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    void tampilInfo() {
        // Format: Alat musik [nama] | Kode: [kode] | Harga: Rp [harga] | Stok: [stok] unit
        System.out.println("Alat musik " + nama + " | Kode: " + kode + " | Harga: Rp " + harga + " | Stok: " + stok + " unit");
    }
}
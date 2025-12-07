public abstract class KendaraanGalaksi {
    private String namaKendaraan;
    private int levelEnergi;
    private int kapasitasPenumpang;

    public KendaraanGalaksi(String nama, int kapasitas) {
        this.namaKendaraan = nama;
        this.kapasitasPenumpang = kapasitas;
        this.levelEnergi = 100; // Default penuh
    }

    // Getters
    public String getNama() { return namaKendaraan; }
    public int getEnergi() { return levelEnergi; }
    public int getKapasitas() { return kapasitasPenumpang; }

    // Setters (protected agar subclass bisa ubah energi)
    protected void setEnergi(int energi) { this.levelEnergi = energi; }

    public final void tampilStatus() {
        System.out.println(namaKendaraan + " | Energi: " + levelEnergi + "% | Kapasitas: " + kapasitasPenumpang + " awak");
    }

    // Abstract Methods
    abstract void aktifkanMesin();
    abstract void jelajah(int jarak);
    abstract void isiEnergi(int jumlah);
}
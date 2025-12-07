public interface KaryawanKontrak {
    // Abstract
    double hitungGaji(int jamKerja);
    void perpanjangKontrak(int durasiBulan);

    // Default
    default String getStatusCuti() {
        return "Tersedia 12 hari";
    }
}
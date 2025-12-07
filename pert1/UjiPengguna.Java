class UjiPengguna {
    public static void main(String[] args) {
        // Buat objek pengguna sesuai Data Uji Coba
        // Umur: 25, Berat: 60, Tinggi: 170
        Pengguna p = new Pengguna("Intan Ayu", 25, 60, 170);

        // Panggil method tampilInfo
        p.tampilInfo();

        // Tampilkan demonstrasi tentang konstanta final
        System.out.println("\n--- Demonstrasi Konstanta Final ---");
        System.out.println("Nilai faktor aktivitas: " + p.FAKTOR_AKTIVITAS);
        System.out.println("Faktor aktivitas bersifat final (konstan)");

        // Uncomment baris di bawah ini akan menyebabkan error
        // p.FAKTOR_AKTIVITAS = 1.5;
    }
}
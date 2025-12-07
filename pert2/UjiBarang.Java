class UjiBarang {
    public static void main(String[] args) {
        System.out.println("=== INVENTARIS TOKO NADAKITA ===");

        // Buat objek barang pertama gitar (Constructor 1)
        BarangMusik gitar = new BarangMusik("GTR-001", "Gitar Akustik Yamaha");

        // Atur harga dan stok gitar
        gitar.ubahHarga(1500000);
        gitar.tambahStok(5);

        // Buat objek drum (Constructor 3 - Data Lengkap)
        BarangMusik drum = new BarangMusik("DRM-001", "Drum Set Pearl", 8500000, 3);

        // Tampilkan informasi
        gitar.tampilInfo();
        drum.tampilInfo();
    }
}
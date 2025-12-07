class UjiKaryawan {
    public static void main(String[] args) {
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");

        // Karyawan Biasa
        Karyawan k = new Karyawan("Budi Santoso", 4000000);
        System.out.println("Status: Karyawan Biasa");
        k.tampilInfo();

        System.out.println();

        // Manajer
        Manajer m = new Manajer("Siti Aminah", 6000000, 2500000);
        System.out.println("Status: Manajer");
        m.tampilInfo();
    }
}
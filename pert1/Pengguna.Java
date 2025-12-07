class Pengguna {
    // State / Variabel
    int umur;
    double berat; // dalam kg
    double tinggi; // dalam cm

    // Konstanta (Final Variable)
    final double FAKTOR_AKTIVITAS = 1.2;

    // Constructor (Opsional, tapi baik untuk inisialisasi)
    public Pengguna(String nama, int umur, double berat, double tinggi) {
        this.umur = umur;
        this.berat = berat;
        this.tinggi = tinggi;
    }

    // 1. Menghitung BMI
    double hitungBMI() {
        double tinggiMeter = tinggi / 100;
        return berat / (tinggiMeter * tinggiMeter);
    }

    // 2. Menampilkan Kategori BMI
    void tampilKategori() {
        double bmi = hitungBMI();
        System.out.print("Kategori: ");
        if (bmi < 18.5) {
            System.out.println("Kurus");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else {
            System.out.println("Obesitas");
        }
    }

    // 3. Menghitung Kebutuhan Kalori
    double hitungKalori() {
        return berat * FAKTOR_AKTIVITAS * 10; // Rumus sederhana sesuai soal
    }

    // 4. Menampilkan Informasi Lengkap
    void tampilInfo() {
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.printf("BMI: %.2f\n", hitungBMI());
        tampilKategori();
        System.out.println("Kebutuhan Kalori: " + hitungKalori() + " kal/hari");
        System.out.println("====================================");
    }
}
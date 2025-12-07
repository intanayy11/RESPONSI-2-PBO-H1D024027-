public class ProgrammerMagang implements KaryawanKontrak, AksesSistem {
    private String nama;
    private double gajiPerJam;
    private String pinRahasia;
    private boolean sedangLogin;

    public ProgrammerMagang(String nama, double gajiPerJam, String pin) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pin;
        this.sedangLogin = false;
    }

    // --- KaryawanKontrak ---
    @Override
    public double hitungGaji(int jamKerja) {
        return jamKerja * gajiPerJam;
    }

    @Override
    public void perpanjangKontrak(int durasi) {
        System.out.println("Kontrak diperpanjang " + durasi + " bulan.");
    }

    @Override
    public String getStatusCuti() {
        return "Tersedia 5 hari"; // Override default
    }

    // --- AksesSistem ---
    @Override
    public void login(String pin) {
        if (pin.equals(pinRahasia)) {
            sedangLogin = true;
            System.out.println("Login Berhasil. Selamat datang, " + nama + "!");
        } else {
            System.out.println("Login Gagal: PIN salah.");
        }
    }

    @Override
    public void logout() {
        sedangLogin = false;
        System.out.println(nama + " berhasil logout.");
    }

    @Override
    public String getRoleAkses() {
        return "Magang IT"; // Override default
    }
}
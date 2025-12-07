public class PesawatTempur extends KendaraanGalaksi {
    private int jumlahRudal;

    public PesawatTempur(String nama, int kapasitas, int jumlahRudal) {
        super(nama, kapasitas);
        this.jumlahRudal = jumlahRudal;
    }

    @Override
    void aktifkanMesin() {
        if (getEnergi() < 20) System.out.println("Energi terlalu rendah!");
        else System.out.println("Mesin pesawat tempur diaktifkan.");
    }

    @Override
    void jelajah(int jarak) {
        int butuh = jarak * 3;
        if (getEnergi() >= butuh) {
            setEnergi(getEnergi() - butuh);
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        } else {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    void isiEnergi(int jumlah) {
        setEnergi(Math.min(100, getEnergi() + jumlah));
        System.out.println("Energi diisi. Sekarang: " + getEnergi() + "%");
    }

    void tembakRudal(int jumlah) {
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Gagal menembak, sisa rudal: " + jumlahRudal);
        }
    }
}
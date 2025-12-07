public class KapalEksplorasi extends KendaraanGalaksi {
    private int modulScan;

    public KapalEksplorasi(String nama, int kapasitas, int modulScan) {
        super(nama, kapasitas);
        this.modulScan = modulScan;
    }

    @Override
    void aktifkanMesin() {
        if (getEnergi() < 15) System.out.println("Energi kurang!");
        else System.out.println("Kapal eksplorasi siap berangkat!");
    }

    @Override
    void jelajah(int jarak) {
        int butuh = jarak * 2; // Lebih hemat
        if (getEnergi() >= butuh) {
            setEnergi(getEnergi() - butuh);
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        } else {
            System.out.println("Energi tidak cukup.");
        }
    }

    @Override
    void isiEnergi(int jumlah) {
        setEnergi(Math.min(100, getEnergi() + jumlah));
    }

    void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + modulScan + ".");
    }
}
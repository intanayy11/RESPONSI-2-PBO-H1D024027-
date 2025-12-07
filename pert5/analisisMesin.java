class analisisMesin {
    public static void main(String[] args) {

        defaultMesin[] mesin = {
                new mesinMotor("Honda Supra X", 125, "Bebek"),
                new mesinTraktor("Kubota MX5200", 520, 5.0),
                new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70),
                new mesinMotor("Yamaha R25", 250, "Sport"),
                new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80)
        };

        System.out.println("=== DATA MESIN MEGATECH ===");
        for (defaultMesin m : mesin) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");
        for (defaultMesin m : mesin) {
            if (m instanceof mesinTraktorListrik)
                ((mesinTraktorListrik) m).suaraMesin();
            else if (m instanceof mesinTraktor)
                ((mesinTraktor) m).suaraMesin();
            else if (m instanceof mesinMotor)
                ((mesinMotor) m).suaraMesin();
        }

        // Cari performa tertinggi
        defaultMesin terbaik = mesin[0];
        for (defaultMesin m : mesin) {
            if (m.nilaiPerforma() > terbaik.nilaiPerforma())
                terbaik = m;
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        System.out.println(terbaik.namaMesin + " → " + terbaik.nilaiPerforma());

        // Sort descending
        for (int i = 0; i < mesin.length - 1; i++) {
            for (int j = i + 1; j < mesin.length; j++) {
                if (mesin[i].nilaiPerforma() < mesin[j].nilaiPerforma()) {
                    defaultMesin temp = mesin[i];
                    mesin[i] = mesin[j];
                    mesin[j] = temp;
                }
            }
        }

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " +
                    mesin[i].namaMesin + " → " +
                    mesin[i].nilaiPerforma());
        }
    }
}

class Member extends Customer {
    int poin;
    String level;

    public Member(String nama, String id, int totalBelanja, int poin, String level) {
        super(nama, id, totalBelanja); // Wajib di baris pertama
        this.poin = poin;
        this.level = level;
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo(); // Panggil info dasar dari parent
        System.out.println("Poin Reward: " + poin + " | Level: " + level);
    }
}
public class UjiSDM {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN PROGRAMMER MAGANG ===");

        ProgrammerMagang andi = new ProgrammerMagang("Andi", 50000.0, "1234");

        // 1. Gaji
        System.out.println("Gaji Andi (160 jam) adalah: Rp " + andi.hitungGaji(160));

        // 2. Cuti
        System.out.println("Status Cuti: " + andi.getStatusCuti());

        // 3. Login Salah
        andi.login("9999");

        // 4. Login Benar
        andi.login("1234");

        // 5. Role
        System.out.println("Role Akses: " + andi.getRoleAkses());

        // 6. Kontrak
        andi.perpanjangKontrak(6);

        // 7. Logout
        andi.logout();
    }
}
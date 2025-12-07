public class UjiCustomer {
    public static void main(String[] args) {
        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        // Customer Biasa
        System.out.println("Status: Customer Biasa");
        Customer c = new Customer("Budi Santoso", "CST-001", 500000);
        c.tampilkanInfo();

        System.out.println();

        // Member
        System.out.println("Status: Member");
        Member m = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");
        m.tampilkanInfo();
    }
}
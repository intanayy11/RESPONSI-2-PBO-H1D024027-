public class PaymentTest {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        EWalletPayment ovo = new EWalletPayment("OVO", 150000);
        System.out.println("Saldo awal: " + (int)ovo.getBalance());

        ovo.processPayment(50000);

        System.out.println("Sisa saldo: " + (int)ovo.getBalance());
        System.out.println("Detail Transaksi: " + ovo.getPaymentDetails());
    }
}
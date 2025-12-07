public class EWalletPayment implements PaymentMethod {
    private String provider;
    private double balance;
    private double lastTxAmount;

    public EWalletPayment(String provider, double initialBalance) {
        this.provider = provider;
        this.balance = initialBalance;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Memproses pembayaran sebesar " + (int)amount + "...");

        double total = amount + getTransactionFee();

        if (balance >= total) {
            balance -= total;
            lastTxAmount = amount;
            System.out.println("Pembayaran berhasil!");
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + provider;
    }

    @Override
    public double getTransactionFee() {
        return 2000;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
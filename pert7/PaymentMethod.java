public interface PaymentMethod {
    void processPayment(double amount);
    String getPaymentDetails();
    double getTransactionFee();
    double getBalance();
}
public class Invoice implements Payable {
    @Override
    public double getPaymentAmount() {
        return 10; // Basispris for almindelig kaffe
    }
}

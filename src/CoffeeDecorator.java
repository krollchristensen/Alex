public abstract class CoffeeDecorator implements Payable {
    protected Payable payable;

    public CoffeeDecorator(Payable payable) {
        this.payable = payable;
    }

    @Override
    public double getPaymentAmount() {
        return payable.getPaymentAmount();
    }
}

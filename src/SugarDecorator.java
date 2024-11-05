public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Payable payable) {
        super(payable);
    }

    @Override
    public double getPaymentAmount() {
        System.out.println("Du har nu tilføjet sukker. Kaffen koster nu: " + (super.getPaymentAmount() + 2));
        return super.getPaymentAmount() + 2;
    }
}

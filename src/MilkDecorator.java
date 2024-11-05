public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Payable payable) {
        super(payable);
    }

    @Override
    public double getPaymentAmount() {
        System.out.println("Du har nu tilføjet mælk i din kaffe. Kaffen koster nu: " + (super.getPaymentAmount() + 4));
        return super.getPaymentAmount() + 4;
    }
}

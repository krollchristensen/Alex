public class Main {
    public static void main(String[] args) {
        Payable kaffe = new Invoice();
        System.out.println("En almindelig kaffe koster: " + kaffe.getPaymentAmount());

        kaffe = new MilkDecorator(kaffe); // Tilføj mælk
        kaffe.getPaymentAmount();

        kaffe = new SugarDecorator(kaffe); // Tilføj sukker
        kaffe.getPaymentAmount();
    }
}

package LabAssignmentSolidPrinciples;

public class OrderAction {
    public static void main(String[] args){

        OrderPlacedTotal order = new OrderPlacedTotalImpl();
        EmailVoiceGenerator voice = new EmailVoiceGeneratorImpl();

        double totalPrice = order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        voice.generateInvoice("order_123.pdf");
        voice.sendEmailNotification("johndoe@example.com");
    }
}
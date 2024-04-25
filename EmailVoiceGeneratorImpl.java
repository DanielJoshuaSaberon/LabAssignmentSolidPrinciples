package LabAssignmentSolidPrinciples;

public class EmailVoiceGeneratorImpl implements EmailVoiceGenerator {

    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Email notification sent to: " + email);
    }
    @Override
    public void generateInvoice(String fileName) {
        System.out.println("Invoice generated: " + fileName);
    }
}

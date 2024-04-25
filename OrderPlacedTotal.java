package LabAssignmentSolidPrinciples;

public interface OrderPlacedTotal {
    double calculateTotal(double price, int quantity);

    void placeOrder(String customerName, String address);
}
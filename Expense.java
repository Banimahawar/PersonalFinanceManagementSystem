package model;

public class Expense extends Transaction {

    private String paymentMethod;

    public Expense(int id, double amount, String category, String date,
                   String description, String paymentMethod) {

        super(id, amount, category, date, description);
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public void displayTransaction() {
        System.out.println("----- EXPENSE -----");
        System.out.println("ID: " + getId());
        System.out.println("Amount: ₹" + getAmount());
        System.out.println("Category: " + getCategory());
        System.out.println("Date: " + getDate());
        System.out.println("Description: " + getDescription());
        System.out.println("Payment Method: " + paymentMethod);
    }
}

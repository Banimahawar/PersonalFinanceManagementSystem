
    package model;

public class Transaction {

    private int id;
    private double amount;
    private String category;
    private String date;
    private String description;

    public Transaction(int id, double amount, String category, String date, String description) {
        this.id = id;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void displayTransaction() {
        System.out.println("ID: " + id);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Category: " + category);
        System.out.println("Date: " + date);
        System.out.println("Description: " + description);
    }
}
    


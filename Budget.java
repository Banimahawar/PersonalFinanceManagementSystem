
package model;

public class Budget {

    private int id;
    private String category;
    private double limit;
    private double spent;

    public Budget(int id, String category, double limit) {
        this.id = id;
        this.category = category;
        this.limit = limit;
        this.spent = 0;
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public double getLimit() {
        return limit;
    }

    public double getSpent() {
        return spent;
    }

    public void addExpense(double amount) {
        spent += amount;
    }

    public double getRemainingBudget() {
        return limit - spent;
    }

    public void displayBudget() {
        System.out.println("----- BUDGET -----");
        System.out.println("ID: " + id);
        System.out.println("Category: " + category);
        System.out.println("Budget Limit: ₹" + limit);
        System.out.println("Spent: ₹" + spent);
        System.out.println("Remaining: ₹" + getRemainingBudget());
    }
}


package service;

import model.Expense;
import java.util.ArrayList;

public class ExpenseService {

    private ArrayList<Expense> expenses;

    public ExpenseService() {
        expenses = new ArrayList<>();
    }

    // Add a new expense
    public void addExpense(Expense expense) {
        expenses.add(expense);
        System.out.println("Expense added successfully!");
    }

    // Display all expenses
    public void displayAllExpenses() {

        if (expenses.isEmpty()) {
            System.out.println("No expense records found.");
            return;
        }

        System.out.println("\n===== ALL EXPENSE RECORDS =====");

        for (Expense expense : expenses) {
            expense.displayTransaction();
            System.out.println();
        }
    }

    // Calculate total expense
    public double getTotalExpense() {

        double total = 0;

        for (Expense expense : expenses) {
            total += expense.getAmount();
        }

        return total;
    }
}

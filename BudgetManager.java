
package service;

import model.Budget;
import java.util.ArrayList;

public class BudgetManager {

    private ArrayList<Budget> budgets;

    public BudgetManager() {
        budgets = new ArrayList<>();
    }

    // Add a new budget
    public void addBudget(Budget budget) {
        budgets.add(budget);
        System.out.println("Budget added successfully!");
    }

    // Display all budgets
    public void displayAllBudgets() {

        if (budgets.isEmpty()) {
            System.out.println("No budget records found.");
            return;
        }

        System.out.println("\n===== ALL BUDGET RECORDS =====");

        for (Budget budget : budgets) {
            budget.displayBudget();
            System.out.println();
        }
    }

    // Find budget by category
    public Budget findBudgetByCategory(String category) {

        for (Budget budget : budgets) {
            if (budget.getCategory().equalsIgnoreCase(category)) {
                return budget;
            }
        }

        return null;
    }

    // Add expense to a category budget
    public void addExpenseToBudget(String category, double amount) {

        Budget budget = findBudgetByCategory(category);

        if (budget != null) {
            budget.addExpense(amount);
            System.out.println("Expense added to " + category + " budget.");
        } else {
            System.out.println("No budget found for category: " + category);
        }
    }
}
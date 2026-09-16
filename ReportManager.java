
package service;

import model.Expense;
import model.Income;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReportManager {

    // Calculate total income
    public double calculateTotalIncome(ArrayList<Income> incomes) {

        double total = 0;

        for (Income income : incomes) {
            total += income.getAmount();
        }

        return total;
    }

    // Calculate total expense
    public double calculateTotalExpense(ArrayList<Expense> expenses) {

        double total = 0;

        for (Expense expense : expenses) {
            total += expense.getAmount();
        }

        return total;
    }

    // Calculate current balance
    public double calculateBalance(ArrayList<Income> incomes,
                                   ArrayList<Expense> expenses) {

        double totalIncome = calculateTotalIncome(incomes);
        double totalExpense = calculateTotalExpense(expenses);

        return totalIncome - totalExpense;
    }

    // Category-wise expense report
    public void categoryWiseExpenseReport(ArrayList<Expense> expenses) {

        HashMap<String, Double> categoryTotals = new HashMap<>();

        for (Expense expense : expenses) {

            String category = expense.getCategory();
            double amount = expense.getAmount();

            categoryTotals.put(
                    category,
                    categoryTotals.getOrDefault(category, 0.0) + amount
            );
        }

        System.out.println("\n===== CATEGORY-WISE EXPENSE REPORT =====");

        for (Map.Entry<String, Double> entry : categoryTotals.entrySet()) {
            System.out.println(
                    entry.getKey() + ": ₹" + entry.getValue()
            );
        }
    }

    // Find highest spending category
    public void highestSpendingCategory(ArrayList<Expense> expenses) {

        if (expenses.isEmpty()) {
            System.out.println("No expense records found.");
            return;
        }

        HashMap<String, Double> categoryTotals = new HashMap<>();

        for (Expense expense : expenses) {

            String category = expense.getCategory();
            double amount = expense.getAmount();

            categoryTotals.put(
                    category,
                    categoryTotals.getOrDefault(category, 0.0) + amount
            );
        }

        String highestCategory = "";
        double highestAmount = 0;

        for (Map.Entry<String, Double> entry : categoryTotals.entrySet()) {

            if (entry.getValue() > highestAmount) {
                highestAmount = entry.getValue();
                highestCategory = entry.getKey();
            }
        }

        System.out.println("\n===== HIGHEST SPENDING CATEGORY =====");
        System.out.println("Category: " + highestCategory);
        System.out.println("Amount: ₹" + highestAmount);
    }
}
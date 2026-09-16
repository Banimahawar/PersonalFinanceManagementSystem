
package service;

import model.Income;
import java.util.ArrayList;

public class IncomeService {

    private ArrayList<Income> incomes;

    public IncomeService() {
        incomes = new ArrayList<>();
    }

    public void addIncome(Income income) {
        incomes.add(income);
        System.out.println("Income added successfully!");
    }

    public void displayAllIncomes() {

        System.out.println("\n===== ALL INCOME RECORDS =====");

        if (incomes.isEmpty()) {
            System.out.println("No income records found.");
            return;
        }

        for (Income income : incomes) {

            System.out.println("-----------------------------");
            System.out.println("ID: " + income.getId());
            System.out.println("Amount: ₹" + income.getAmount());
            System.out.println("Category: " + income.getCategory());
            System.out.println("Date: " + income.getDate());
            System.out.println("Description: " + income.getDescription());
            System.out.println("Source: " + income.getSource());
        }

        System.out.println("-----------------------------");
    }

    public double getTotalIncome() {

        double total = 0;

        for (Income income : incomes) {
            total += income.getAmount();
        }

        return total;
    }
}
import model.Income;
import model.Expense;
import model.Budget;

import service.IncomeService;
import service.ExpenseService;
import service.BudgetManager;
import service.TransactionManager;
import service.ReportManager;
import service.MenuManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IncomeService incomeService = new IncomeService();
        ExpenseService expenseService = new ExpenseService();
        BudgetManager budgetManager = new BudgetManager();
        TransactionManager transactionManager = new TransactionManager();
        ReportManager reportManager = new ReportManager();
        MenuManager menuManager = new MenuManager(scanner);

        // Sample Income
        Income income1 = new Income(
                1,
                25000,
                "Salary",
                "15-09-2026",
                "Monthly salary",
                "Job"
        );

        Income income2 = new Income(
                2,
                5000,
                "Scholarship",
                "15-09-2026",
                "College scholarship",
                "College"
        );

        // Sample Expenses
        Expense expense1 = new Expense(
                3,
                500,
                "Food",
                "15-09-2026",
                "College lunch",
                "UPI"
        );

        Expense expense2 = new Expense(
                4,
                1000,
                "Transport",
                "15-09-2026",
                "Bus and auto",
                "Cash"
        );

        // Add income
        incomeService.addIncome(income1);
        incomeService.addIncome(income2);

        // Add expenses
        expenseService.addExpense(expense1);
        expenseService.addExpense(expense2);

        // Add transactions
        transactionManager.addTransaction(income1);
        transactionManager.addTransaction(income2);
        transactionManager.addTransaction(expense1);
        transactionManager.addTransaction(expense2);

        // Budgets
        Budget foodBudget = new Budget(1, "Food", 3000);
        Budget transportBudget = new Budget(2, "Transport", 2000);

        budgetManager.addBudget(foodBudget);
        budgetManager.addBudget(transportBudget);

        budgetManager.addExpenseToBudget("Food", 500);
        budgetManager.addExpenseToBudget("Transport", 1000);

        boolean running = true;

        while (running) {

            menuManager.displayMainMenu();

            int choice = menuManager.getChoice();
            System.out.println("DEBUG: Choice received = " + choice);

            System.out.println("Selected option: " + choice);

            switch (choice) {

                case 1:

    System.out.println("\n===== ADD INCOME =====");

    int incomeId = menuManager.getId("Enter Income ID: ");
    double incomeAmount = menuManager.getAmount("Enter Amount: ");
    String incomeCategory = menuManager.getText("Enter Category: ");
    String incomeDate = menuManager.getText("Enter Date: ");
    String incomeDescription = menuManager.getText("Enter Description: ");
    String incomeSource = menuManager.getText("Enter Income Source: ");

    Income newIncome = new Income(
            incomeId,
            incomeAmount,
            incomeCategory,
            incomeDate,
            incomeDescription,
            incomeSource
    );

    incomeService.addIncome(newIncome);
    transactionManager.addTransaction(newIncome);

    System.out.println("Income added successfully!");

    break;

                case 2:

    System.out.println("\n===== ADD EXPENSE =====");

    int expenseId = menuManager.getId("Enter Expense ID: ");
    double expenseAmount = menuManager.getAmount("Enter Amount: ");
    String expenseCategory = menuManager.getText("Enter Category: ");
    String expenseDate = menuManager.getText("Enter Date: ");
    String expenseDescription = menuManager.getText("Enter Description: ");
    String paymentMethod = menuManager.getText("Enter Payment Method: ");

    Expense newExpense = new Expense(
            expenseId,
            expenseAmount,
            expenseCategory,
            expenseDate,
            expenseDescription,
            paymentMethod
    );

    expenseService.addExpense(newExpense);
    transactionManager.addTransaction(newExpense);

    System.out.println("Expense added successfully!");

    break;

               case 3:
    System.out.println("\n===== MANAGE BUDGET =====");

    int budgetId = menuManager.getId("Enter Budget ID: ");
    String budgetCategory = menuManager.getText("Enter Budget Category: ");
    double budgetLimit = menuManager.getAmount("Enter Budget Limit: ");

    Budget newBudget = new Budget(
            budgetId,
            budgetCategory,
            budgetLimit
    );

    budgetManager.addBudget(newBudget);

    System.out.println("Budget added successfully!");
    break;

               case 4:
    System.out.println("\n===== VIEW TRANSACTION =====");

    int transactionId = menuManager.getId(
            "Enter Transaction ID: "
    );

    transactionManager.displayTransactionById(transactionId);

    break;

                case 5:
    System.out.println("\n===== FINANCIAL REPORT =====");

    System.out.println("1. View Total Summary");
    System.out.println("2. Category-wise Expense Report");
    System.out.println("3. Highest Spending Category");

    int reportChoice = menuManager.getChoiceForReport(
            "Enter Report Choice: "
    );

    ArrayList<Income> incomes =
            new ArrayList<>(Arrays.asList(income1, income2));

    ArrayList<Expense> expenses =
            new ArrayList<>(Arrays.asList(expense1, expense2));

    switch (reportChoice) {

        case 1:
            double totalIncome =
                    reportManager.calculateTotalIncome(incomes);

            double totalExpense =
                    reportManager.calculateTotalExpense(expenses);

            double balance =
                    reportManager.calculateBalance(incomes, expenses);

            System.out.println("Total Income: ₹" + totalIncome);
            System.out.println("Total Expense: ₹" + totalExpense);
            System.out.println("Current Balance: ₹" + balance);
            break;

        case 2:
            reportManager.categoryWiseExpenseReport(expenses);
            break;

        case 3:
            reportManager.highestSpendingCategory(expenses);
            break;

        default:
            System.out.println("Invalid report choice.");
            break;

        case 4: {

    System.out.println("\n===== VIEW TRANSACTION =====");

    int viewTransactionId = menuManager.getId(
        "Enter Transaction ID: "
);

transactionManager.displayTransactionById(viewTransactionId);

break;
}
// ================= FINANCIAL REPORT =================
case 5: {

    System.out.println("\n===== FINANCIAL REPORT =====");

    int reportChoice5 = menuManager.getChoiceForReport(
            "Enter Report Choice: "
    );

    ArrayList<Income> reportIncomes5 = new ArrayList<>();
    reportIncomes5.add(income1);
    reportIncomes5.add(income2);

    ArrayList<Expense> reportExpenses5 = new ArrayList<>();
    reportExpenses5.add(expense1);
    reportExpenses5.add(expense2);

    if (reportChoice5 == 1) {

        double reportTotalIncome5 =
                reportManager.calculateTotalIncome(reportIncomes5);

        double reportTotalExpense5 =
                reportManager.calculateTotalExpense(reportExpenses5);

        double reportBalance5 =
                reportManager.calculateBalance(
                        reportIncomes5,
                        reportExpenses5
                );

        System.out.println("\n===== TOTAL SUMMARY =====");
        System.out.println("Total Income: ₹" + reportTotalIncome5);
        System.out.println("Total Expense: ₹" + reportTotalExpense5);
        System.out.println("Balance: ₹" + reportBalance5);

    } else if (reportChoice5 == 2) {

        double reportTotalIncomeOnly5 =
                reportManager.calculateTotalIncome(reportIncomes5);

        System.out.println("\n===== INCOME REPORT =====");
        System.out.println("Total Income: ₹" + reportTotalIncomeOnly5);

    } else if (reportChoice5 == 3) {

        double reportTotalExpenseOnly5 =
                reportManager.calculateTotalExpense(reportExpenses5);

        System.out.println("\n===== EXPENSE REPORT =====");
        System.out.println("Total Expense: ₹" + reportTotalExpenseOnly5);

    } else {

        System.out.println("Invalid Report Choice!");

    }

    break;
}


                case 6:
                    running = false;
                    System.out.println();
                    System.out.println(
                            "Thank you for using Personal Finance Manager!"
                    );
                    break;
    }
                default:
                    System.out.println(
                            "Invalid choice! Please enter a number from 1 to 6."
                    );
            }
        }
    }
    }



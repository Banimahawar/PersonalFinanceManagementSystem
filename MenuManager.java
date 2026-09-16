
package service;

import java.util.Scanner;

public class MenuManager {

    private Scanner scanner;

    public MenuManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayMainMenu() {
        System.out.println();
        System.out.println("=================================");
        System.out.println("     PERSONAL FINANCE MANAGER");
        System.out.println("=================================");
        System.out.println("1. Add Income");
        System.out.println("2. Add Expense");
        System.out.println("3. Manage Budget");
        System.out.println("4. View Transactions");
        System.out.println("5. View Reports");
        System.out.println("6. Exit");
        System.out.println("=================================");
    }

    public int getChoice() {
        while (true) {
            System.out.print("Enter your choice: ");

            String input = scanner.nextLine().trim();

            try {
                int choice = Integer.parseInt(input);

                if (choice >= 1 && choice <= 6) {
                    return choice;
                }

                System.out.println("Please enter a number between 1 and 6.");

            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
    }

    public String getText(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println("Input cannot be empty.");
        }
    }

    public double getAmount(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();

            try {
                double amount = Double.parseDouble(input);

                if (amount > 0) {
                    return amount;
                }

                System.out.println("Amount must be greater than zero.");

            } catch (NumberFormatException e) {
                System.out.println("Invalid amount! Please enter a number.");
            }
        }
    }

    public int getId(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();

            try {
                int id = Integer.parseInt(input);

                if (id > 0) {
                    return id;
                }

                System.out.println("ID must be greater than zero.");

            } catch (NumberFormatException e) {
                System.out.println("Invalid ID! Please enter a number.");
            }
        }
    }
    public int getChoiceForReport(String message) {

    while (true) {

        System.out.print(message);

        String input = scanner.nextLine().trim();

        try {

            int choice = Integer.parseInt(input);

            if (choice >= 1 && choice <= 3) {
                return choice;
            }

            System.out.println("Please enter a number between 1 and 3.");

        } catch (NumberFormatException e) {

            System.out.println("Invalid input! Please enter a number.");

        }
    }
}
}

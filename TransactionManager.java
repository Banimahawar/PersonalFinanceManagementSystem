package service;

import model.Transaction;
import java.util.ArrayList;

public class TransactionManager {

    private ArrayList<Transaction> transactions;

    public TransactionManager() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

   
public void displayAllTransactions() {

    if (transactions.isEmpty()) {
        System.out.println("No transactions found.");
        return;
    }

    for (Transaction transaction : transactions) {

        System.out.println("-----------------------------");
        System.out.println("ID: " + transaction.getId());
        System.out.println("Amount: ₹" + transaction.getAmount());
        System.out.println("Category: " + transaction.getCategory());
        System.out.println("Date: " + transaction.getDate());
        System.out.println("Description: " + transaction.getDescription());
    }

    System.out.println("-----------------------------");
}
public void displayTransactionById(int id) {

    for (Transaction transaction : transactions) {

        if (transaction.getId() == id) {

            System.out.println("\n===== TRANSACTION DETAILS =====");
            System.out.println("ID: " + transaction.getId());
            System.out.println("Amount: ₹" + transaction.getAmount());
            System.out.println("Category: " + transaction.getCategory());
            System.out.println("Date: " + transaction.getDate());
            System.out.println("Description: " + transaction.getDescription());

            return;
        }
    }

    System.out.println("Transaction with ID " + id + " not found.");
}


}


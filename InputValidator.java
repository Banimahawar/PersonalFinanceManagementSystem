
package util;

public class InputValidator {

    // Checks whether amount is greater than zero
    public static boolean isValidAmount(double amount) {
        return amount > 0;
    }

    // Checks whether text is not null or empty
    public static boolean isValidText(String text) {
        return text != null && !text.trim().isEmpty();
    }

    // Checks whether ID is a positive number
    public static boolean isValidId(int id) {
        return id > 0;
    }

    // Checks whether menu choice is between 1 and 6
    public static boolean isValidMenuChoice(int choice) {
        return choice >= 1 && choice <= 6;
    }
}
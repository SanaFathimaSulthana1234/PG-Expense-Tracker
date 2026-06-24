import java.util.ArrayList;

public class ExpenseManager {

    private ArrayList<Expense> expenses;

    // Constructor
    public ExpenseManager() {
        expenses = new ArrayList<>();
    }

    // Add Expense
    public void addExpense(Expense expense) {
        expenses.add(expense);
        System.out.println("Expense added successfully!");
    }

    // View All Expenses
    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }

        System.out.println("\n----- Expense List -----");
        for (Expense expense : expenses) {
            System.out.println(expense);
        }
    }

    // Calculate Total Expenses
    public double calculateTotalExpenses() {
        double total = 0;

        for (Expense expense : expenses) {
            total += expense.getAmount();
        }

        return total;
    }

    // Search Expense by Category
    public void searchExpenseByCategory(String category) {
        boolean found = false;

        for (Expense expense : expenses) {
            if (expense.getCategory().equalsIgnoreCase(category)) {
                System.out.println(expense);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No expenses found in category: " + category);
        }
    }

    // Delete Specific Expense by Category and description
    public void deleteExpense(String category, String description) {

    for (int i = 0; i < expenses.size(); i++) {

        Expense expense = expenses.get(i);

        if (expense.getCategory().equalsIgnoreCase(category)
                && expense.getDescription().equalsIgnoreCase(description)) {

            expenses.remove(i);
            System.out.println("Expense deleted successfully!");
            return;
        }
    }

    System.out.println("Expense not found.");
}
}
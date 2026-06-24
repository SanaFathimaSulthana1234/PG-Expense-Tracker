import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        while (true) {

            System.out.println("\n===== PG Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Calculate Total Expenses");
            System.out.println("4. Search Expense by Category");
            System.out.println("5. Delete Expense");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Description: ");
                    String description = sc.nextLine();

                    System.out.print("Enter Date: ");
                    String date = sc.nextLine();

                    Expense expense =
                            new Expense(category, amount, description, date);

                    manager.addExpense(expense);
                    break;

                case 2:
                    manager.viewExpenses();
                    break;

                case 3:
                    double total = manager.calculateTotalExpenses();
                    System.out.println("Total Expenses:" + total);
                    break;

                case 4:
                    System.out.print("Enter Category to Search: ");
                    String searchCategory = sc.nextLine();

                    manager.searchExpenseByCategory(searchCategory);
                    break;

                case 5:
                    System.out.print("Enter Category: ");
                    String deleteCategory = sc.nextLine();

                    System.out.print("Enter Description: ");
                    String deleteDescription = sc.nextLine();

                    manager.deleteExpense(deleteCategory, deleteDescription);
                    break;

                case 6:
                    System.out.println("Thank you for using PG Expense Tracker!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }
    }
}
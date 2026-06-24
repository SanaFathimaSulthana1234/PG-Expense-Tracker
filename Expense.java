public class Expense {
    private String category;
    private double amount;
    private String description;
    private String date;

    // Constructor
    public Expense( String category, double amount, String description, String date) {
        this.category = category;
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    // Getters

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    // Display expense details
    @Override
    public String toString() {
        return 
               " Category: " + category +
               ", Amount:" + amount +
               ", Description: " + description +
               ", Date: " + date;
    }
}
package midterm;

public class Invoice {
    // Amount is an integer
    private int amount;
    private int month;
    private int day;
    private int year;
    private String payee;

    public Invoice(int amount, int month, int day, String payee) {
        this.amount = amount;
        this.month = month;
        this.day = day;
        this.payee = payee;
    }

    // Setters/Mutators
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getters/Accessors
    public int getAmount() {
        return amount;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getPayee() {
        return payee;
    }

    // Other methods
    public void printInvoice() {
        System.out.println(
                "amount:" + amount
                        + ", month:" + month
                        + ", day:" + day
                        + ", payee:" + payee);
    }

}

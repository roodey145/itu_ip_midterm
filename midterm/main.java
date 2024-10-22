package midterm;

import java.util.Scanner;

// All fields must have the private access modifier
// All methods must have the public access modifier
public class main {

    private static Scanner _scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Invoice i1 = new Invoice(50, 2, 5, "Abdul");
        Invoice i2 = new Invoice(55, 3, 5, "Abdul");
        Invoice i3 = new Invoice(25, 2, 5, "Abdul");

        ExpensesTracker tracker = new ExpensesTracker(5000);

        System.out.println("Before Adding Invoices: " + tracker.monthExpenses(2));

        tracker.addInvoice(i1);
        tracker.addInvoice(i2);
        tracker.addInvoice(i3);

        System.out.println("After Adding Invoices: " + (tracker.monthExpenses(3) + tracker.monthExpenses(2)));

        tracker.readInvoice();

    }

}

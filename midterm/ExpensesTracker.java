package midterm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ExpensesTracker {
    private int income;
    private List<Invoice> yearlyInvoices; // This list is used for keeping track of the invoices

    public ExpensesTracker(int income) {
        yearlyInvoices = new ArrayList<>();
        this.income = income;
    }

    public void addInvoice(Invoice i) {
        yearlyInvoices.add(i);
    }

    /**
     * Get the sum of all invoices of the month "m"
     * 
     * @param m is a month value 1-12
     * @return The sum of all the invoices during month "m"
     */
    public int monthExpenses(int m) {
        int sum = 0;

        // Map<Integer, ArrayList<Invoice>> months = new HashMap<>();

        // for(int mIndex = 1; mIndex < months.size(); mIndex++){
        // List<Invoice> monthInvoices = months.get(mIndex);
        // for(int invoiceI = 0; invoiceI < months.get(mIndex).size(); invoiceI++){
        // Invoice invoice = monthInvoices.get(mIndex);
        // }
        // }

        // for (int i = 0; i < yearlyInvoices.size(); i++) {
        // // Invoice invoice = yearlyInvoices.get(i);
        // if(yearlyInvoices.get(i).getMonth() == m){
        // sum += yearlyInvoices.get(i).getAmount();
        // }
        // }

        for (Invoice invoice : yearlyInvoices) {
            if (invoice.getMonth() == m) {
                // invoice was given during the month "m"
                // sum += invoice.getAmount();
                sum = sum + invoice.getAmount();
            }
        }

        return sum;
    }

    public int monthSaving(int m) {
        int saving = income - monthExpenses(m);

        return saving;
    }

    public void readInvoice() {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine()); // Day
        int month = Integer.parseInt(scanner.nextLine()); // Month
        int amount = Integer.parseInt(scanner.nextLine()); // Month
        String payee = scanner.nextLine(); // Payee

        Invoice userInvoice = new Invoice(amount, month, day, payee);

        yearlyInvoices.add(userInvoice);

        scanner.close();
    }

    public void clearMonthInvoices(int m) {

        Iterator<Invoice> iter = yearlyInvoices.iterator();
        while (iter.hasNext()) {
            Invoice invoice = iter.next();
            if (invoice.getMonth() == m) {
                iter.remove();
            }
        }
    }

    public void listYearlySavings() {
        int savings;
        for (int month = 1; month < 13; month++) {
            savings = monthSaving(month);
            if (savings <= 0) {
                System.out.println("no saving in month " + month);
            } else {
                System.out.println(
                        "the saved amount in month "
                                + month + " is "
                                + savings);
            }
        }
    }

    public Map<String, Integer> payeeAmount() {
        Map<String, Integer> payeePays = new HashMap<>();

        for (Invoice invoice : yearlyInvoices) {
            String payee = invoice.getPayee();
            // Check if the payee is already in the map
            if (payeePays.containsKey(payee)) {
                // The payee is in the map, then get how much money he was given so far
                int curSum = payeePays.get(payee);
                // Update the amount the payee has been paid
                payeePays.put(payee, curSum + invoice.getAmount());
            } else {
                payeePays.put(payee, invoice.getAmount());
            }
        }

        return payeePays;
    }

}
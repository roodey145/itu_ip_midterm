package controlFlow;

import java.util.Scanner;

public class controlFlowMain {
    private static Scanner _scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number = _scanner.nextInt();
        // _scanner.close();
        _scanner.nextLine();

        boolean condition = (number % 2) == 0;

        if (condition) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        // Convert the if-else statement to a conditional operator
        String result = condition
                ? "The number is even"
                : "The number is odd";
        System.out.println(result);

        // When we say number modulus 7, the largest reminder can be 6 and the smallest
        // reminder can be 0. When we plus one to the result, we increase the lowest
        // possible reminder to 1 and the largest possible reminder to 7
        int day = number % 7 + 1; // 1-7
        // int wrongDay = (++number) % 7; // 0-6

        // int dayNumber = _scanner.nextInt();
        _scanner.close();
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = ("Thursday");
                break;
            case 5:
                dayName = ("Friday");
                break;
            case 6:
                dayName = ("Saturday");
                break;
            case 7:
                dayName = ("Sunday");
                break;
            default:
                dayName = "Doesn't exist";
                break;
        }

        System.out.println(dayName);
    }
}

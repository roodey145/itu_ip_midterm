package arithmetic;

public class main {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;

        System.out.println("Pre-Increment: \n" + "Before: " + x + "\nAfter: " + ++x + "\n");
        System.out.println("Post-Increment: \n" + "Before: " + y + "\nAfter: " + y++);
        // The value of y is 2
        System.out.println("Sum of x(" + x + ") and y(" + y + "): " + (x + y));

        // Arithmetic
        System.out.println("\n\n\n================================");
        System.out.println("Arithmetic");
        System.out.println("x is " + x);
        x = x + 1;
        System.out.println("After \"x += 1\" x is " + x);
        x = x / 2;
        System.out.println("After \"x /= 2\" x is " + x);
        x = x * 5;
        System.out.println("After \"x *= 5\" x is " + x);
        x = x - 1;
        System.out.println("After \"x -= 1\" x is " + x);
        x = x % 3;
        System.out.println("After \"x %= 3\" x is " + x);

        // Compound Arithmetic
        System.out.println("\n\n\n================================");
        System.out.println("Compound Arithmetic");
        System.out.println("x is " + x);
        x += 1; // x = x + 1;
        System.out.println("After \"x += 1\" x is " + x);
        x /= 2; // x = x / 2;
        System.out.println("After \"x /= 2\" x is " + x);
        x *= 5;
        System.out.println("After \"x *= 5\" x is " + x);
        x -= 1;
        System.out.println("After \"x -= 1\" x is " + x);
        x %= 3;
        System.out.println("After \"x %= 3\" x is " + x);

    }
}

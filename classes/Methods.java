package classes;

public class Methods {
    private String stringValue;
    private int intNumber;
    private long longNumber;
    private float floatNumber;
    private double doubleNumber;
    private char character;

    public Methods() {
        System.out.println("===================\nThe constructor runs first\n\n");
    }

    public Methods(String text) {
        this();
        stringValue = text;
    }

    public Methods(String text, int number) {
        this(text);
        intNumber = number;
    }

    public void setValue(String text) {
        stringValue = text;
    }

    // That is wrong!!!
    // public void setValue(String intNumber){ ... }

    public void setValue(int number) {
        intNumber = number;
    }

    // This is wrong!!!
    // public int setValue(int number){}

    public void setValue(long longNumber, float floatNumber, double number) {
        this.longNumber = longNumber;
        this.floatNumber = floatNumber;
        doubleNumber = number;
    }

    public void setValue(char character) {
        this.character = character;
    }

    public void display() {
        System.out.println("\nClass Info\n===============");
        System.out.println("String : " + stringValue);
        System.out.println("Int : " + intNumber);
        System.out.println("Long : " + longNumber);
        System.out.println("Float : " + floatNumber);
        System.out.println("Double : " + doubleNumber);
        System.out.println("Char : " + character);
        System.out.println("\n\n");
    }
}

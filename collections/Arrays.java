package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Arrays {
    // An array is just a storage that saves information
    private int[] numbers; // <-- This is an array because it has ->[]
    private int capacity = 10;
    // Map<String, Integer> courses;

    public Arrays() {
        numbers = new int[capacity];
        // numbers = new int[capacity + 5];

        // int[] x = new int[5];
        // x = new int[7];
        // // float[] x = new float[5];

        // courses = new HashMap<>();
        // courses = new TreeMap<>();

        // We want to assign a value to each element of the array
        // The value is the following sequence 10, 20, 30, ...., n*10
        // Notice that "n" is the number of elements and not the index of it
        // "n" is always the index of "n" plus one, because index start at 0
        for (int i = 0; i < numbers.length; i++) {

            // To access the n-th element of the array we use the name of the array which
            // is, in this case, "numbers" and then we follow it by "[]" between which we
            // write the index of the element we want. I.e. [n - 1] or [i]
            // Notice that "n" starts from 1 and "i" starts from 0, thus (n - 1) = i
            numbers[i] = (i + 1) * 10;
            // What happens in the above line is, the right-hand side of the equal sign will
            // be evaluated and then the result will be assigned to the "n-th" element of
            // the array
        }
    }

    public void displayNumbers() {
        // Prints all the element of the numbers array
        for (int i = 0; i < numbers.length; i++) {
            displayNumber(i);
        }
    }

    /**
     * This array display an element of the numbers array
     * 
     * @param index the index of the element
     */
    public void displayNumber(int index) {
        // Make sure to only print a number if the index is inside the array
        // The lowest index of the array is "0" and the largest index is
        // the size of the array minus 1, i.e. numbers.length - 1
        // Thus, if the index is less than zero, then, it is outside the array
        // or if the index is larger or equal to the size of the array then it is
        // outside the array
        if (index < 0 || index >= numbers.length) {
            // The index is outside the boundaries of the array
            System.out.println("The index(" + index + ") is outside the boundaries of the array!");
        } else {
            // The index is inside the array
            System.out.println("The element (" + (index + 1) + ") with the index(" + index + ") is " + numbers[index]);
        }
    }

    public void updateNumber(int index, int newValue) {
        // We need to update the value of the array
        // First make sure that the index is inside the array
        if (index < 0 || index >= numbers.length) {
            // The index is outside the boundaries of the array
            System.out.println("The index(" + index + ") is outside the boundaries of the array!");
        } else {
            numbers[index] = newValue;
        }
    }

    public int getNumber(int index) throws Exception {
        // We need to return a number with specific index
        // Makes sure that the index is within the boundaries of the array
        if (index < 0 || index >= numbers.length) {
            // The index is outside the boundaries of the array
            throw new Exception("The index(" + index + ") is outside the boundaries of the array!");
        }

        return numbers[index];
    }
}

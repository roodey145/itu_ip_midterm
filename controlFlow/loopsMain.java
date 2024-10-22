package controlFlow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class loopsMain {
    // private static int[] numbers;
    private static Scanner _scanner = new Scanner(System.in);
    // private loopsMain[] classArray;
    private static List<Integer> numbers;

    public static void main(String[] args) {
        // numbers = new int[10];
        numbers = new ArrayList<>();

        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Iterator<Integer> iter = numbers.iterator();
        while (iter.hasNext()) {
            int curValue = iter.next();
            System.out.println(curValue);
            iter.remove();
        }

        // for (int i = 0; i < numbers.length; i++) {
        // // if (i == 1) {
        // // numbers[i] = 1;
        // // } else {
        // // numbers[i] = i * 2;
        // // }

        // // ? :
        // numbers[i] = i == 1 ? 1 : i * 2;

        // System.out.println("numbers[" + i + "] = " + numbers[i]);
        // }

        // numbers = new int[15];
        // int number0 = 0;
        // int number1 = 0;
        // int number2 = 0;
        // int number3 = 0;
        // int number4 = 0;
        // int number5 = 0;
        // int number6 = 0;
        // int number7 = 0;
        // numbers[1]

        // for(initializing; condition; increment){

        // }

        // for (int i = 1; i < 10; i += 2) {
        // System.out.println(i);
        // }

        // for(int number : numbers){

        // }

        // Random random = new Random();
        // for (int i = 1, j = 0; j < numbers.length; j++) {
        // // String number = _scanner.nextLine();
        // // numbers[i] = random.nextInt(0, 256); // 0 - 255

        // numbers[j] = j + i;
        // System.out.println("numbers[" + j + "] = " + numbers[j]);
        // }

        // for (int i = 0; i < numbers.length; i++) {
        // numbers[i] = (i + 1);
        // }

        // Print the numbers from the first element to the last
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.println("Index(" + i + ") has value " + numbers[i]);
        // }

        // Print the numbers from the last element to the first

    }
}

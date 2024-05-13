package Question1;

import java.util.Scanner;

public class ArrayQuestion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sequence of numbers separated by spaces: ");
        String[] numbersStr = scanner.nextLine().split(" ");
        int[] numbers = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }

        System.out.print("Enter a number to be searched: ");
        int searchNumber = scanner.nextInt();

        int count = 0;
        for (int num : numbers) {
            if (num == searchNumber) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The number " + searchNumber + " appears " + count + " time(s) in the sequence.");
        } else {
            System.out.println("The number " + searchNumber + " is not present in the sequence.");
        }

        scanner.close();
    }
}

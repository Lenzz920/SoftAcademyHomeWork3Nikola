package homework;

import java.util.Scanner;

public class Problem_4_Occurrences_Count {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please provide your preferred length of an array");
        int num = sc.nextInt();

        int[] array = new int[num];

        System.out.println("Please provide a number");
        int numCount = sc.nextInt();

        writeToArray(array);
        System.out.println("Your number occured " + countNumFromArray(array, numCount) + " times in the array");

        System.out.println("\nProgram terminated");
        sc.close();

    }

    public static void writeToArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please provide a number that will be stored in the array");
            array[i] = sc.nextInt();
        }
    }

    public static int countNumFromArray (int[] array, int num) {
        int counter = 0;
        for (int n : array) {
            if(n == num) {
                counter++;
            }
        }
        return counter;
    }

}

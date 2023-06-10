package homework;

import java.util.Scanner;

import static homework.Problem_4_Occurrences_Count.writeToArray;

public class Problem_6_Reverse_Elements {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please provide the number of your preferred array length");
        int arrayLength = sc.nextInt();

        int[] array = new int[arrayLength];

        writeToArray(array);
        printArray(array);

        System.out.println("");

        reverseElements(array);
        printArray(array);

    }

    public static void reverseElements (int[] array) {
        int[] anotherArray = new int[array.length];
        int y = 0;

        for(int i = 0; i < array.length;i++) {
            anotherArray[i] = array[i];
        }

        for(int i = array.length - 1; i >= 0;i--, y++) {
            array[i] = anotherArray[y];
        }

    }

    public static void printArray (int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
    }

}

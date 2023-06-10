package homework;


import java.util.Scanner;

import static homework.Problem_6_Reverse_Elements.reverseElements;

public class Problem_8_Number_To_Array {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please provide a number");
        int a = sc.nextInt();

        String getLength = "" + a;
        int[] array = new int[getLength.length()];

        int temp = 0;
        int i = 0;

        while (a != 0) {
            temp = a % 10;
            array[i] = temp;
            i++;
            a = a / 10;
        }

        reverseElements(array);
        printArray(array);
        endProgram();

    }

    public static void printArray(int[] array) {
        for(int n = 0; n < array.length; n++) {
            System.out.print(array[n]);
            if (n < array.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void endProgram() {
        System.out.println("\nProgram terminated");
        sc.close();
    }
}

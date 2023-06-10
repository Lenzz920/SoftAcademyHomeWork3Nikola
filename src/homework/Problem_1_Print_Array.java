package homework;

import java.util.Scanner;

public class Problem_1_Print_Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your preferred length of the array");

        int numOfArray = sc.nextInt();
        int[] array = new int[numOfArray];

        for(int i = 0; i < numOfArray; i++) {
            System.out.println("Please enter a number in your array:");
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("\nProgram terminated");
        sc.close();
    }

}

package homework;

import java.util.Scanner;

import static homework.Problem_8_Number_To_Array.*;

public class Problem_9_Create_An_Array {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please provide a number");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }

        printArray(array);
        endProgram();
    }

}

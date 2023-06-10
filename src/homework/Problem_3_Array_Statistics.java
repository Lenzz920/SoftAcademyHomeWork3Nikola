package homework;

import java.util.Scanner;

public class Problem_3_Array_Statistics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide your preferred length of an array (Number must be odd!): ");

        int num = sc.nextInt();
        if (num % 2 == 0) {
            throw new RuntimeException("The number you have entered is not odd");
        }

        int[] array = new int[num];

        for(int i = 0; i < array.length; i++) {
            System.out.println("Please provide a number, that will be stored inside the array");
            array[i] = sc.nextInt();
        }

        System.out.println("The min number of the array is " + minNumber(array));
        System.out.println("The max number of the array is " + maxNumber(array));
        System.out.println("The sum of the array is " + sumOfArray(array));
        System.out.println("The mult of the array is " + multOfArray(array));
        System.out.println("The avg number of the array is " + avgOfArray(array));

        System.out.println("\nProgram terminated");
        sc.close();

    }

    public static int minNumber (int[] array) {
        int min = array[0];
        for (int n : array) {
            if (min > n) {
                min = n;
            }
        }
        return min;
    }

    public static int maxNumber (int[] array) {
        int max = array[0];
        for (int n : array) {
            if (max < n) {
                max = n;
            }
        }
        return max;
    }

    public static int sumOfArray (int[] array) {
        int sumResult = 0;
        for (int n : array) {
            sumResult += n;
        }
        return sumResult;
    }

    public static double multOfArray (int[] array) {
        double multResult = 1;
        for (int n : array) {
            multResult *= n;
        }
        return multResult;
    }

    public static double avgOfArray (int[] array) {
        double avgResult = 0;
        int sum = sumOfArray(array);
        avgResult = sum / array.length;
        return avgResult;
    }

}

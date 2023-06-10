package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_2_Max_Element {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your preferred length of the array");

        int numOfArray = sc.nextInt();
        double[] array = new double[numOfArray];

        for(int i = 0; i < numOfArray; i++) {
            System.out.println("Please enter a number in your array:");
            array[i] = sc.nextDouble();
        }

        double maxNumber = array[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }

        System.out.println("The max element is: " + maxNumber);
        System.out.println(Arrays.stream(array).max().getAsDouble());

        System.out.println("\nProgram terminated");
        sc.close();

    }
}

package homework;

import java.util.Scanner;

import static homework.Problem_4_Occurrences_Count.writeToArray;

public class Problem_5_Array_To_Number {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please provide your preferred length of an array: ");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];

        System.out.println("Please provide an equation operator. Can be +, - or * only!");
        char symbol = sc.next().charAt(0);
        validateSymbol(symbol);
        writeToArray(array);
        System.out.println(equation(array, symbol));

        System.out.println("\nProgram terminated");
        sc.close();
    }

    public static void validateSymbol(char symbol) {
        if (symbol != '+' && symbol != '-' && symbol != '*') {
            throw new RuntimeException("Please enter a correct equation operator");
        }
    }

    public static int equation(int[] array, char symbol) {
        int result = determineResult(symbol);

        for (int i = 0; i < array.length - 1; i++) {
            switch (symbol) {
                case '+':
                    result += array[i];
                    break;
                case '-':
                    result -= array[i];
                    break;
                case '*':
                    result *= array[i];
                    break;
                default:
                    System.out.println("You managed to brake something, well done");
            }
        }
        return result;
    }

    public static int determineResult (char symbol) {
        int result = 0;
        if (symbol == '*') {
            result = 1;
        }
        return result;
    }

}

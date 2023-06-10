package additional;

import java.util.Scanner;

import static additional.Problem_4_Delete_Array_Elements.endProgram;
import static additional.Problem_6_Censor_Bad_Words.readArray;

public class Problem_7_To_Lowercase {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] array = createArray();
        readArray(array);
        System.out.println();

        toLowerCase(array);
        readArray(array);

        endProgram();

    }

    public static String[] createArray () {
        System.out.println("How many elements would you like to have in your array?");
        int numberOfElements = sc.nextInt();

        String[] array = new String[numberOfElements];

        for(int i = 0; i < array.length; i++) {
            System.out.println("Add an element to the array");
            array[i] = sc.next();
        }

        return array;
    }

    public static void toLowerCase(String[] array) {

        for(int i = 0; i < array.length; i++) {
            array[i] = array[i].toLowerCase();
        }

    }

}

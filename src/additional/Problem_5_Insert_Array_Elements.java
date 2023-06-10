package additional;

import java.util.Scanner;

import static additional.Problem_4_Delete_Array_Elements.*;

public class Problem_5_Insert_Array_Elements {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = createArrayWithInput();
        readArray(array);

        int[] newArray = addElements(array);
        readArray(newArray);

        endProgram();

    }

    public static int[] addElements(int[] array) {
        System.out.println("\nHow many elements do you want to add to the array?");
        int count = sc.nextInt();

        int[] newArray = new int[array.length + count];

        for(int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        for(int j = array.length; j < newArray.length; j++) {
            System.out.println("Please provide your number");
            newArray[j] = sc.nextInt();
        }

        return newArray;
    }
}

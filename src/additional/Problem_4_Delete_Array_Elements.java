package additional;

import java.util.Scanner;

public class Problem_4_Delete_Array_Elements {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = createArrayWithInput();
        readArray(array);

        int[] newArray = deleteElements(array);
        readArray(newArray);

        endProgram();

    }

    public static int[] createArrayWithInput() {
        System.out.println("Please provide a number of the array");
        int length = sc.nextInt();
        int[] array = new int[length];

        for(int i = 0; i < array.length; i++) {
            System.out.println("Please enter a number that you would like to add to the array");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void readArray (int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i != array.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static int[] deleteElements(int[] array) {
        int count = -1;
        int j = 0;

        System.out.println("\nPlease enter a number that you would like to delete from the array");
        final int delete = sc.nextInt();

            for (int n : array) {
                if(n != delete) {
                    count++;
                }
            }

        int[] newArray = new int[array.length - count];

            for(int i = 0; i < array.length; i++) {
                if(array[i] != delete) {
                    newArray[j] = array[i];
                    j++;
                }
        }
            return newArray;
    }

    static void endProgram() {
        System.out.println("\nProgram terminated");
        sc.close();
    }

}

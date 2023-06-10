package additional;

import java.util.Scanner;

import static additional.Problem_4_Delete_Array_Elements.*;

public class Problem_8_Bubble_Sort {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = createArrayWithInput();
        readArray(array);
        System.out.println();

        bubbleSortAsc(array);
        readArray(array);
        System.out.println();

        bubbleSortDesc(array);
        readArray(array);
        System.out.println();

        endProgram();
    }

    public static void bubbleSortDesc (int[] array) {

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

    }

    public static void bubbleSortAsc (int[] array) {

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                if(array[i] < array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

    }



}

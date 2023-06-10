package additional;

import java.util.Scanner;

import static additional.Problem_4_Delete_Array_Elements.*;

public class Problem_6_Censor_Bad_Words {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] array = createArrayWithInput();
        readArray(array);
        endProgram();

    }

    public static String[] createArrayWithInput() {
        System.out.println("Please provide a number of the array");
        int length = sc.nextInt();
        String[] array = new String[length];

        for(int i = 0; i < array.length; i++) {
            System.out.println("Please enter a word that you would like to add to the array");
            String nextWord = sc.next();
            String badWord = "";

            if(nextWord.equals("BadWord")){
                int stars = nextWord.length();
                for(int j = 0; j < stars; j++) {
                    badWord = badWord + "*";
                }
                array[i] = badWord;
            } else {
                array[i] = nextWord;
            }

        }
        return array;
    }

    public static void readArray (String[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i != array.length - 1) {
                System.out.print(", ");
            }
        }
    }


}

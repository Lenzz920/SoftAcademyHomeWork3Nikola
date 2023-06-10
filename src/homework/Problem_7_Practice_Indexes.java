package homework;

import java.util.Scanner;

import static homework.Problem_4_Occurrences_Count.writeToArray;

public class Problem_7_Practice_Indexes {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = initializeArray();
        writeToArray(array);

        /*
        Написах два различни метода за sum & multiply, защото говорихме, че е добре всяка функция да е изолирана в отделен метод
        Предполагам, може да се напише една функция, която взима 2 параметъра, един за сумиране и друг за умножение
        от тип void, и вътре в if-а ако е четно да умножава единия параметер, ако не да събира другия. Но не съм сигурен кой подход
        е по-правилен.
         */

        System.out.println("The sum of your odd numbers is " + sumOdd(array));
        System.out.println("The multiplication of your even numbers is " + multEven(array));

        System.out.println("\nProgram terminated");
        sc.close();
    }

    public static int[] initializeArray () {
        System.out.println("Please provide the number of your preferred array length");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        return array;
    }

    public static int sumOdd (int[] array) {
        int sum = 0;
        for (int n : array) {
            if (n % 2 != 0) {
                sum += n;
            }
        }
        return sum;
    }

    public static int multEven (int[] array) {
        int mult = 1;
        for (int n : array) {
            if (n % 2 == 0) {
                mult *= n;
            }
        }
        return mult;
    }

}

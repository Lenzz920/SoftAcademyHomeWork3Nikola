package additional;

import java.util.Scanner;

public class Problem_9_Wall_Shooting {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] wall = {
                { 3, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7 },
                { 9, 8, 7, 5, 9, 8, 7, 4, 5, 9, 6 },
                { 3, 6, 5, 4, 8, 9, 6, 3, 2, 1, 5 },
                { 6, 9, 8, 5, 3, 2, 1, 5, 6, 3, 2 },
                { 3, 2, 6, 9, 8, 5, 6, 3, 2, 1, 3 },
                { 3, 6, 9, 9, 8, 5, 2, 3, 1, 2, 5}
        };

        shooting(wall);
        printMatrix(wall);
    }

    public static void shooting (int[][] array) {
        System.out.println("Pick a row");
        int row = sc.nextInt();
        System.out.println("Pick a column");
        int column = sc.nextInt();
        System.out.println("Pick a radius");
        int radius = sc.nextInt();

        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                double distance = Math.sqrt((r - row) * (r - row) + (c - column) * (c - column));

                if (distance <= radius) {
                    array[r][c] = 0;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }

            System.out.println();
        }
    }

}

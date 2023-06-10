package homework;

public class Problem_11_Print_Matrices {




    public static void main(String[] args) {

        int[][] array1 = { {3, 5, 3, 1}, {4, 5, 7, 5}, {5, 8, 4, 1}};
        int[][] array2 = { {34, 54, 14, 5}, {6, 65, 3, 4}, {4, 5, 6, 1}, {4, 5, 99885, 4}};
        int[][] array3 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        printMatrix(array1);
        printMatrix(array2);
        printMatrix(array3);

    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }


}

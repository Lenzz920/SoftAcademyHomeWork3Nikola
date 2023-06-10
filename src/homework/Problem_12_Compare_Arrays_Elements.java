package homework;

public class Problem_12_Compare_Arrays_Elements {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 5};
        int[] array2 = {1, 2, 3, 4};

        System.out.println("It is " + compareTwoArrays(array1, array2) + " that the arrays are the same");

    }

    public static boolean compareTwoArrays(int[] array1, int[] array2) {
        boolean check = false;
        if(array1.length != array2.length) {
        } else {
            for(int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }
        }
        return check;
    }

}

package additional;

public class Problem_2_Contains_Element {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3};

        System.out.println(containsElement(array,4));


    }

    public static boolean containsElement (int[] array, int x) {
        boolean check = false;

        for(int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                check = true;
                break;
            }
        }
        return check;
    }

}

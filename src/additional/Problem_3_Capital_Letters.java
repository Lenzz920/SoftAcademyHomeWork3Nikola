package additional;

public class Problem_3_Capital_Letters {

    public static void main(String[] args) {

        String[] array = {"hey", "test", "Uppercase", "sUpperCase", "maybelastletteR", "Miami", "Date"};
        printWordsThatStartWithUpperCase(array);



    }

    public static void printWordsThatStartWithUpperCase (String[] array) {
        for(int i = 0; i < array.length; i++) {
            if(Character.isUpperCase(array[i].charAt(0))) {
                System.out.println(array[i]);
            }
        }
    }

}

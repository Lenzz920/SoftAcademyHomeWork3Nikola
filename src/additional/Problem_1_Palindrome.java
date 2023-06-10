package additional;

public class Problem_1_Palindrome {

    public static void main(String[] args) {

        String[] a = {"hey", "a", "a", "dsa","hey"};
        int j = a.length - 1;
        int middle = 0;
        boolean flag = false;

        System.out.println(a.length);

        if(a.length % 2 == 0) {
           middle = a.length / 2;
        } else {
            middle = (a.length / 2) + 1;
        }

        for(int i = 0; i < middle; i++) {
            if(a[i] == a[j]) {
                flag = true;
                j--;
            } else {
                flag = false;
                break;
            }
        }

        System.out.println(flag);

    }

}

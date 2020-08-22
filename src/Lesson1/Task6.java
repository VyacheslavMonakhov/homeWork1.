package Lesson1;

public class Task6 {

    public static void main(String[] args) {
        System.out.println(isNegative(-3));
        System.out.println(isNegative(0));
        System.out.println(isNegative(-3));
    }

    private static boolean isNegative (int digit) {
        return digit < 0;
    }
}

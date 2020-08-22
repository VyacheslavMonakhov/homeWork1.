package Lesson1;

public class Task4 {

    public static void main(String[] args) {
        System.out.println(test(6,14));
        System.out.println(test(7,10));
        System.out.println(test(2,5));
        System.out.println(test(6,16));
    }

    private static boolean test (int a, int b) {
        int sum =a+b;
        return sum >= 10 && sum <= 20;

    }
}

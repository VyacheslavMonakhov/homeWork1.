package Lesson1;

public class Task_3 {

    public static void main(String[] args) {
        double result = evaluationExpression(2,3,4,5);
        System.out.println(result);
    }

    private static double evaluationExpression (int a, int b, int c, int d) {
        if (d==0) {
            return 0;
        }
            return a * (b + (1.0 * c / d));
    }
}

package Lesson2;

public class Task3 {
    public static void main(String[] args) {
        int [] num = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int o : num) {
            if (o < 6) {o = o * 2;}
            System.out.print(o + " ");
        }
    }
}

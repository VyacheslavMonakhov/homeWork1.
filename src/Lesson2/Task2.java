package Lesson2;

public class Task2 {

    public static void main(String[] args) {
        int [] arr = new int [8];
        fillArrays(arr);
    }

    private static void fillArrays(int[] arr) {
        for (int i = 0, v = 0; i < arr.length; i++, v += 3) {
            arr [i] = v;
            System.out.println(arr[i]);
        }
    }
}

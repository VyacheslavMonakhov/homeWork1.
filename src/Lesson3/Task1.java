package Lesson3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача угадать число. У Вас есть 3 попытки");
        int range = 9;
        int number = (int) (Math.random()* range);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали.");
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
        scanner.close();
    }
}

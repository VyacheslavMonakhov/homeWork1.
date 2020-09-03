package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    private static final int ATTEMPT_NUMBER = 3;
    private static final int MAX_VALUE = 9;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            playGame(random, scanner);

            System.out.println("Повторить игру ещё раз? 1 - да / 0 - нет");

            int result = scanner.nextInt();
            if (result == 0) {
                break;
            }
        }
    }

    private static void playGame(Random random, Scanner scanner) {
        int targetValue = random.nextInt(MAX_VALUE + 1);
        System.out.println("Ваша задача угадать число от 0 до 9. У Вас есть 3 попытки");

        boolean isWin = false;
        for (int attempt = 0; attempt < ATTEMPT_NUMBER; attempt++) {
            System.out.printf("Попытка номер %d.%n", attempt + 1);
            int input_number = scanner.nextInt();
            if (input_number == targetValue) {
                System.out.println("Вы угадали.");
                isWin = true;
                break;
            } else if (input_number > targetValue) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
        String messageResult = isWin ? "Вы победитель!" : "Вы проиграли";
        System.out.println(messageResult);
    }
}
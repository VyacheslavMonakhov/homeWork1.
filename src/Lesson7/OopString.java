package Lesson7;

import java.util.Scanner;

public class OopString {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Murka", 15),
                new Cat("BlackCat", 4),
                new Cat("Barsik", 7),
        };

        Plate plate = new Plate(10);

        printInfo(cats, plate);
        haveLaunch(cats, plate);

        printInfo(cats, plate);

        addFood(plate);

        System.out.println("Added Food: ");
        plate.info();
        System.out.println();

        haveLaunch(cats, plate);
        printInfo(cats, plate);
    }

    private static void addFood(Plate plate) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new food count: ");
        int foodCount = scanner.nextInt();
        plate.addFood(foodCount);
    }

    private static void haveLaunch(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            boolean result = cat.eat(plate);
            System.out.printf("Did Cat '%s eat? Answer: %s%n", cat.getName(), result);
        }
        System.out.println();
    }

    private static void printInfo(Cat[] cats, Plate plate) {
        System.out.println("--- Info ---");
        plate.info();
        printInfo(cats);
        System.out.println("------");
        System.out.println();
    }

    private static void printInfo(Cat[] cats) {
        for (Cat cat : cats) {
            System.out.printf("Is cat '%s(appitite: %d)' hungry? Answer: %s%n",
                    cat.getName(),
                    cat.getAppetite(),
                    !cat.isSatiety());
        }
    }
}

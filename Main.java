import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Лабораторна робота 3");
        System.out.println("Складання програм циклічної структури");
        System.out.println();


        // Завдання 1
        System.out.println("Завдання 1. Виведення фрази 50 разів за допомогою for");

        String phrase = "Я вивчаю мову програмування Java";

        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ". " + phrase);
        }

        System.out.println();

        System.out.println("Завдання 1. Виведення фрази 50 разів за допомогою while");

        int counter = 1;

        while (counter <= 50) {
            System.out.println(counter + ". " + phrase);
            counter++;
        }

        System.out.println();


        // Завдання 2
        System.out.println("Завдання 2. Виведення часу від 0 h 0 min до 2 h 59 min за допомогою for");

        for (int hour = 0; hour <= 2; hour++) {
            for (int minute = 0; minute <= 59; minute++) {
                System.out.println(hour + " h " + minute + " min");
            }
        }

        System.out.println();


        // Завдання 3
        System.out.println("Завдання 3. Виведення часу від 0 h 0 min до 2 h 59 min за допомогою while");

        int hourWhile = 0;

        while (hourWhile <= 2) {
            int minuteWhile = 0;

            while (minuteWhile <= 59) {
                System.out.println(hourWhile + " h " + minuteWhile + " min");
                minuteWhile++;
            }

            hourWhile++;
        }

        System.out.println();


        // Завдання 4
        System.out.println("Завдання 4. Виведення часу від 0 h 0 min 0 sec до 2 h 59 min 59 sec");

        for (int hour = 0; hour <= 2; hour++) {
            for (int minute = 0; minute <= 59; minute++) {
                for (int second = 0; second <= 59; second++) {
                    System.out.println(hour + " h " + minute + " min " + second + " sec");
                }
            }
        }

        System.out.println();


        // Завдання 5
        System.out.println("Завдання 5. Табулювання функції, варіант 10");
        System.out.println("f(x) = sqrt(x^3 + x + 1.5) / (x + 1)");
        System.out.println("Проміжок: [0; 4]");
        System.out.println("Крок: 0.2");

        System.out.print("Введіть нижню межу діапазону значень функції: ");
        double lowerLimit = scanner.nextDouble();

        System.out.print("Введіть верхню межу діапазону значень функції: ");
        double upperLimit = scanner.nextDouble();

        double start = 0.0;
        double end = 4.0;
        double step = 0.2;

        int countFor = 0;

        System.out.println();
        System.out.println("Табулювання функції за допомогою циклу for:");

        for (double x = start; x <= end + 0.000001; x += step) {
            double y = Math.sqrt(Math.pow(x, 3) + x + 1.5) / (x + 1);

            System.out.printf("x = %.1f; f(x) = %.4f%n", x, y);

            if (y >= lowerLimit && y <= upperLimit) {
                countFor++;
            }
        }

        if (countFor > 0) {
            System.out.println("Кількість значень функції у заданому діапазоні: " + countFor);
        } else {
            System.out.println("У заданому діапазоні значень функції немає.");
        }

        System.out.println();

        int countWhile = 0;
        double xWhile = start;

        System.out.println("Табулювання функції за допомогою циклу while:");

        while (xWhile <= end + 0.000001) {
            double y = Math.sqrt(Math.pow(xWhile, 3) + xWhile + 1.5) / (xWhile + 1);

            System.out.printf("x = %.1f; f(x) = %.4f%n", xWhile, y);

            if (y >= lowerLimit && y <= upperLimit) {
                countWhile++;
            }

            xWhile += step;
        }

        if (countWhile > 0) {
            System.out.println("Кількість значень функції у заданому діапазоні: " + countWhile);
        } else {
            System.out.println("У заданому діапазоні значень функції немає.");
        }

        scanner.close();
    }
}
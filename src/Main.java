public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("задача 1 ");
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("\nзадача 2 ");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("\nзадача 3 ");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("\nзадача 4 ");
        for (int i = 10; i > -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("\nзадача 5 ");
        for (int i = 1904; i < 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6() {
        System.out.println("\nзадача 6 ");
        for (int i = 7; i < 100; i += 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("\nзадача 7 ");
        for (int i = 1; i < 513; i *= 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("\nзадача 8 ");
        int box = 0;
        for (int i = 1; i < 13; i++) {
            int summ = 29000;
            box = box + summ;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + box + " рублей");
        }
    }

    public static void task9() {
        System.out.println("\nзадача 9 ");

        int deposit = 29000;
        int depositPenny = deposit * 100;
        double accumulation = 0;
        int summ = 0;
        for (int i = 1; i < 13; i++) {
            summ = summ + summ / 100;
            summ = summ + depositPenny;
            accumulation = summ / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + accumulation + " рублей");
        }
        System.out.println(accumulation);
    }

    public static void task10() {
        System.out.println("\nзадача 10 ");
        for (int i = 1; i < 11; i++) {
            int a = i * 2;
            System.out.println(" 2 * " + i + " = " + a);
        }
    }
}

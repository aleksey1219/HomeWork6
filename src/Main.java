public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

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
        for (int i = 0; i <17; i+=2) {
            System.out.println(i);
        }
    }
}
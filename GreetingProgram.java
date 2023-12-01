import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Привет! Как тебя зовут?");
        String name = scanner.nextLine();

        System.out.println("Приятно познакомиться, " + name + "!");
    }
}

import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Привет! Как тебя зовут?");
        String name = scanner.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println("Приятно познакомиться, " + name + "!");
        }
    }
}

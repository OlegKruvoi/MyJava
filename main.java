public class Main {
    // Метод для вычисления факториала числа
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        long result = factorial(num);

        // Вывод результата
        System.out.println("Факториал числа " + num + " равен " + result);
    }
}

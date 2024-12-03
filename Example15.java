import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();

        int sum = a + b;
        int dif = a - b;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + dif);

        scanner.close();
    }
}


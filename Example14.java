import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int num = scanner.nextInt();

        int a = num - 1;
        int b = num;
        int c = num + 1;
        int d = (int) Math.pow((a + b + c),2);

        System.out.println(a + ", " + b + ", " + c + ", " + d);

        scanner.close();
    }
}
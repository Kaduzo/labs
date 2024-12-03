import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название месяца: ");
        String month = scanner.nextLine(); 
        System.out.print("Введите день месяца: ");
        int date = scanner.nextInt();

        System.out.printf(month + " содержит " + date + " дней"  );

        scanner.close();
    }
}
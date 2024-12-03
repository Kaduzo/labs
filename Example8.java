import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название текущего дня недели: ");
        String day = scanner.nextLine();
        System.out.print("Введите название месяца: ");
        String month = scanner.nextLine(); 
        System.out.print("Введите день месяца: ");
        int date = scanner.nextInt();

        System.out.printf("Сегодня: " + day + " " + date + " " + month);

        scanner.close();
    }
}
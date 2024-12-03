import java.time.Year;
import java.util.Scanner;

public class Example11 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите ваш год рождения:");
        int bYear = scanner.nextInt();

        Year yearNow = Year.now();
        int yearInt = yearNow.getValue();
        int age = yearInt - bYear;

        System.out.println("Ваше имя: "+ name +" ваш возраст: " + age + " лет");
        scanner.close();
    }
}
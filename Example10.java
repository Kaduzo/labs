import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class Example10 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш год рождения:");
        int bYear = scanner.nextInt();

        Year yearNow = Year.now();
        int yearInt = yearNow.getValue();
        int age = yearInt - bYear;
        
        System.out.println("Ваш возраст: " + age + " лет");
        scanner.close();
    }
}
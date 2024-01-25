import java.util.Objects;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите имя: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String correct_name = "Вячеслав";
        if (Objects.equals(name, correct_name)) {
            System.out.println("Привет, Вячеслав");
        }else{
            System.out.println("Нет такого имени");
        }
    }
}


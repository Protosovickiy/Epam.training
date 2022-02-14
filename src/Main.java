import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите имя");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Приветствуем Вас - " + name);
    }
}

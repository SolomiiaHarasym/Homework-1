import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name;
        String address;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Як вас звати?");
        name = scanner.nextLine();

        System.out.println("Де ви живете, " + name + "?");
        address = scanner.nextLine();

        System.out.println("Ім'я: " + name);
        System.out.println("Адреса: " + address);

        scanner.close();
    }
}

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Введіть радіус клумби:");
        double radius = scanner.nextDouble();


        double perimeter = 2 * Math.PI * radius;


        double area = Math.PI * Math.pow(radius, 2);


        System.out.println("Периметр клумби: " + perimeter);
        System.out.println("Площа клумби: " + area);


        scanner.close();
    }
}

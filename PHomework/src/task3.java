import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть вартість за хвилину для першого дзвінка (c1):");
        double c1 = scanner.nextDouble();
        System.out.println("Введіть тривалість першого дзвінка (t1) у хвилинах:");
        double t1 = scanner.nextDouble();

        System.out.println("Введіть вартість за хвилину для другого дзвінка (c2):");
        double c2 = scanner.nextDouble();
        System.out.println("Введіть тривалість другого дзвінка (t2) у хвилинах:");
        double t2 = scanner.nextDouble();

        System.out.println("Введіть вартість за хвилину для третього дзвінка (c3):");
        double c3 = scanner.nextDouble();
        System.out.println("Введіть тривалість третього дзвінка (t3) у хвилинах:");
        double t3 = scanner.nextDouble();
        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;
        double totalCost = cost1 + cost2 + cost3;

        System.out.println("Вартість першого дзвінка: " + cost1);
        System.out.println("Вартість другого дзвінка: " + cost2);
        System.out.println("Вартість третього дзвінка: " + cost3);
        System.out.println("Загальна вартість всіх дзвінків: " + totalCost);

        scanner.close();
    }
}

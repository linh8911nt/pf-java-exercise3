import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        double radius; //bán kính
        double diameter; //chu vi
        double area; //diện tích

        final double PI = 3.14; //số pi
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bán kính:");
        radius = scanner.nextDouble();

        diameter = 2 * PI * radius;
        area = PI * radius * radius;

        System.out.println("Chu vi:" + diameter);
        System.out.println("Diện tích:" + area);

    }
}

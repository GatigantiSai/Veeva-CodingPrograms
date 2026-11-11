import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        double area;

        switch (choice) {
            case 1:
                double r = sc.nextDouble();
                area = 3.14 * r * r;
                System.out.printf("%.2f", area);
                break;

            case 2:
                double l = sc.nextDouble();
                double w = sc.nextDouble();
                area = l * w;
                System.out.printf("%.2f", area);
                break;

            case 3:
                double b = sc.nextDouble();
                double h = sc.nextDouble();
                area = 0.5 * b * h;
                System.out.printf("%.2f", area);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}

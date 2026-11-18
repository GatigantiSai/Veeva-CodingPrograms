
import java.util.Scanner;

interface DiscountStrategy {
    double calculateDiscount(double amount);
}

class RegularDiscount implements DiscountStrategy {
    public double calculateDiscount(double amount) {
        return amount * 0.05;
    }
}

class PremiumDiscount implements DiscountStrategy {
    public double calculateDiscount(double amount) {
        return amount * 0.15;
    }
}

public class OrderProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        double amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("Invalid Amount");
        } else {
            DiscountStrategy d;

            if (type.equals("R")) {
                d = new RegularDiscount();
            } else {
                d = new PremiumDiscount();
            }

            double payable = amount - d.calculateDiscount(amount);

            System.out.printf("%.2f", payable);
        }

        sc.close();
    }
}

import java.util.Scanner;

public class DebugTheDiscountLogic {
    static double finalAmount(double amount) {
        if (amount >= 5000) {
            return amount * 0.90;
        } else if (amount >= 2000) {
            return amount * 0.95;
        }
        return amount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();

        System.out.printf(java.util.Locale.US, "%.2f%n", finalAmount(amount));
        sc.close();
    }
}

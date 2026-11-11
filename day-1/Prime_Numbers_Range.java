
import java.util.Scanner;

public class Prime_Numbers_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();

        boolean found = false;
        for (int i = l; i <= r; i++) {
            boolean prime = true;
            if (i < 2) {
                prime = false;
            }
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }
    }
}

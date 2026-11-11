import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            totalSum += a[i];
        }

        int leftSum = 0;
        int index = -1;

        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - a[i];

            if (leftSum == rightSum) {
                index = i;
                break;
            }

            leftSum += a[i];
        }

        System.out.println(index);
    }
}

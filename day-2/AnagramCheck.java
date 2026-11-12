import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();

        String a = first.replaceAll("\\s+", "").toLowerCase(java.util.Locale.ROOT);
        String b = second.replaceAll("\\s+", "").toLowerCase(java.util.Locale.ROOT);

        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        System.out.println(Arrays.equals(arrA, arrB) ? "Yes" : "No");
        sc.close();
    }
}

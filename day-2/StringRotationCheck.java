import java.util.Scanner;

public class StringRotationCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        boolean isRotation = a.length() == b.length()
                && (a + a).contains(b);

        System.out.println(isRotation ? "Yes" : "No");
        sc.close();
    }
}

import java.util.Scanner;

public class RunLengthEncoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder compressed = new StringBuilder();
        int i = 0;

        while (i < input.length()) {
            char current = input.charAt(i);
            int count = 0;

            while (i < input.length() && input.charAt(i) == current) {
                count++;
                i++;
            }

            compressed.append(current);
            if (count > 1) {
                compressed.append(count);
            }
        }

        String result = compressed.length() < input.length()
                ? compressed.toString()
                : input;

        System.out.println(result);
        sc.close();
    }
}

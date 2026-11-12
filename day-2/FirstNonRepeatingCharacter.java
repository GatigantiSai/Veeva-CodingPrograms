import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Map<Character, Integer> frequency = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ') {
                frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
            }
        }

        Character answer = null;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ' && frequency.get(ch) == 1) {
                answer = ch;
                break;
            }
        }

        System.out.println(answer == null ? "None" : answer);
        sc.close();
    }
}

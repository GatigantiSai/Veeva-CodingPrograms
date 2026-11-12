import java.util.Scanner;

public class ImmutableStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String word = sc.nextLine();

        if (word.isEmpty()) {
            System.out.println(sentence);
        } else {
            System.out.println(sentence.replace(word, word.toUpperCase(java.util.Locale.ROOT)));
        }
        sc.close();
    }
}

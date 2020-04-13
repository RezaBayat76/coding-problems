import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }

        String chars = scanner.next();
        System.out.println(countCharacters(words, chars));
    }

    public static int countCharacters(String[] words, String chars) {
        int count = 0;
        for (String word: words) {
            if (isValidWord(word, chars)) {
                count += word.length();
            }
        }

        return count;
    }

    public static boolean isValidWord(String word, String chars) {
        Map<Character, Integer> charsCount = new HashMap<>();
        for (char c: chars.toCharArray()) {
            if (charsCount.containsKey(c)) {
                charsCount.put(c, charsCount.get(c) + 1);
            } else {
                charsCount.put(c, 1);
            }
        }

        for (char c: word.toCharArray()) {
            if (!charsCount.containsKey(c)) {
                return false;
            }

            if (charsCount.get(c) <= 0) {
                return false;
            }

            charsCount.put(c, charsCount.get(c) - 1);
        }
        return true;
    }
}

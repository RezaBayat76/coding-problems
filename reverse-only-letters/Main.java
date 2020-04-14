import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(reverseOnlyLetters(input));
    }

    public static String reverseOnlyLetters(String input) {

        Map<Integer, Character> nonCharIndices = new HashMap<>();
        List<Character> letters = new ArrayList<>();
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                letters.add(chars[i]);
            } else {
                nonCharIndices.put(i, chars[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        int letterIndex = letters.size() - 1;
        for (int i = 0; i < chars.length; i++) {
            if (nonCharIndices.containsKey(i)) {
                sb.append(nonCharIndices.get(i));
            } else {
                sb.append(letters.get(letterIndex));
                letterIndex--;
            }
        }

        return sb.toString();
    }
}

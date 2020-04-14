import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(isValid(input));
    }

    public static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }
                char pop = stack.pop();

                if (c == ')' && pop != '(') {
                    return false;
                }

                if (c == '}' && pop != '{') {
                    return false;
                }

                if (c == ']' && pop != '[') {
                    return false;
                }

            }
        }

        return stack.isEmpty();
    }
}

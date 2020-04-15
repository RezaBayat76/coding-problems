import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(lengthOfLastWord(input));
    }

    public static int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        if (split.length == 0) {
            return 0;
        }
        return split[split.length - 1].length();
    }
}

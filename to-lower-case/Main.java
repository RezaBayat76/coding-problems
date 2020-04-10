import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        int diff = 32;
        int lowerBound = 65;
        int upperBound = 90;
        String result = "";
        for (char c : input.toCharArray()) {
            int charInt = (int) c;
            if (charInt >= lowerBound && charInt <= upperBound) {
                result += (char) (charInt + diff);
            } else {
                result += c;
            }
        }

        System.out.println(result);
    }
}

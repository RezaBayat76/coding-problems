import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] emails = new String[n];
        for (int i = 0; i < n; i++) {
            emails[i] = scanner.next();
        }

        System.out.println(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            uniqueEmails.add(actualEmail(email));
        }

        return uniqueEmails.size();
    }
//    ["test.email+alex@leetcode.com","test.email.leet+alex@code.com"]

    public static String actualEmail(String email) {
        String[] emailSplit = email.split("@");

        StringBuilder sb = new StringBuilder();
        for (char c : emailSplit[0].toCharArray()) {
            if (c == '+') {
                break;
            }

            if (c == '.') {
                continue;
            }

            sb.append(c);
        }

        sb.append('@');
        sb.append(emailSplit[1]);

        return sb.toString();
    }
}
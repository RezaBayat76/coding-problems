import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.next();
        }

        List<List<String>> result = groupAnagrams(strs);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String s : strs) {
            char tempArray[] = s.toCharArray();
            Arrays.sort(tempArray);
            String sorted = new String(tempArray);
            if (anagrams.containsKey(sorted)) {
                anagrams.get(sorted).add(s);
            } else {
                List<String> anagram = new ArrayList<>();
                anagram.add(s);
                anagrams.put(sorted, anagram);
            }
        }

        return new ArrayList<>(anagrams.values());
    }
}

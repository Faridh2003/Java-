import java.util.*;

public class set {
    static void main(String[] args) {

        String s = "aaa bcb ab aaa abc axyz ab xyz";
        String[] words = s.split(" ");

        Set<String> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;
        int startIndex = 0;

        for (int right = 0; right < words.length; right++) {
            while (set.contains(words[right])) {
                set.remove(words[left]);
                left++;
            }
            set.add(words[right]);

            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                startIndex = left;
            }
        }
        System.out.print("Longest substring: ");
        for (int i = startIndex; i < startIndex + maxLen; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println("\nLength: " + maxLen);
    }
}

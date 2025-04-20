package Arrays.Easy;
import java.util.*;

public class CheckiftheSentenceIsPangram {
    public static boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            set.add(c);
        }

        return set.size() == 26;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
}

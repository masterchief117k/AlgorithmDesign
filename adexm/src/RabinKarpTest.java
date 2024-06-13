import java.util.ArrayList;
import java.util.List;

public class RabinKarpTest {
    public static void main(String[] args) {
        String text = "AABAACAADAABAABA";
        String pattern = "AABA";

        List<Integer> occurrences = new ArrayList<>();
        int hashPattern = pattern.hashCode();

        for (int i = 0; i + pattern.length() <= text.length(); i++) {
            String substring = text.substring(i, i + pattern.length());
            if (substring.hashCode() == hashPattern && substring.equals(pattern)) {
                occurrences.add(i);
            }
        }

        System.out.println("Pattern found at indices: " + occurrences);
    }
}

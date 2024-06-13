public class BruteForceTest {
    public static void main(String[] args) {
        String text = "THIS IS A TEST TEXT";
        String pattern = "TEST";

        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            boolean match = true;
            for (int j = 0; j < pattern.length(); j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }
}

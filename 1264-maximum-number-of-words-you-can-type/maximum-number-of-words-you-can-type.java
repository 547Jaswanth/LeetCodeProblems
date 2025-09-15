import java.util.regex.Pattern;

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] textArr = text.split(" ");
        int count = 0;

        if (brokenLetters.isEmpty()) {
            return textArr.length;
        }

        String safeBrokenLetters = Pattern.quote(brokenLetters);
        String regex = ".*[" + brokenLetters + "].*";

        for (String word : textArr) {
            if (!word.matches(regex)) {
                count++;
            }
        }
        return count;
    }
}

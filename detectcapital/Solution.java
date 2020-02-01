package algorithm.detectcapital;

public class Solution {
    public static boolean detectCapitalUse(String word) {
        if (word == null) {
            return false;
        }
        int wordLength = word.length();
        if (wordLength == 1) {
            return true;
        }
        boolean firstCharIsUpperCase = Character.isUpperCase(word.charAt(0));
        boolean secondCharIsUpperCase = Character.isUpperCase(word.charAt(1));
        if (!firstCharIsUpperCase) {
            // 如果第一个字母是小写的，接下来的字母有一个是大写的就是false
            for (int i = 1; i < wordLength; i++) {
                // 如果接下来的字母有一个是大写，就
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
            return true;
        } else {
            // 如果第一个字母是大写
            for (int i = 2; i < wordLength; i++) {
                if (Character.isUpperCase(word.charAt(i)) != secondCharIsUpperCase) {
                    return false;
                }
            }
            return true;
        }

    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("FlaG"));
        System.out.println(detectCapitalUse("leetcode"));
        System.out.println(detectCapitalUse("False"));
    }
}

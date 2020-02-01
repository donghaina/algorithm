package algorithm.palindromenumber;

public class Solution {
    public static boolean isPalindrome(int x) {

        String s = String.valueOf(x);
        int numLen = s.length();
        if (numLen == 1) {
            return true;
        }
        for (int i = 0; i < numLen / 2; i++) {
            if (s.charAt(i) != s.charAt(numLen - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}

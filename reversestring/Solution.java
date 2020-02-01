package algorithm.reversestring;

import java.util.Arrays;

public class Solution {
    public static void reverseString(char[] s) {
        if (s == null) {
            return;
        }
        if(s.length ==0){
            return;
        }
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};
        reverseString(s);
        System.out.print(Arrays.toString(s));
    }
}

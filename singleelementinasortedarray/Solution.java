package algorithm.singleelementinasortedarray;

import java.util.Arrays;

public class Solution {
    public static int singleNonDuplicate(int[] nums) {
        if (nums == null) {
            return -1;
        }
        int numLen = nums.length;
        // 只有一个数字时，返回第一个
        if (numLen == 1) {
            return nums[0];
        }
        // unique 出现在首位
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        // unique 出现在尾部
        if (nums[numLen - 1] != nums[numLen - 2]) {
            return nums[numLen - 1];
        }

        for (int i = 1; i < numLen - 1; i++) {
            if ((nums[i - 1] != nums[i]) && (nums[i] != nums[i + 1])) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
        System.out.println(singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11}));
        System.out.println(singleNonDuplicate(new int[]{1, 1, 2}));
    }
}

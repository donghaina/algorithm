package algorithm.twosum;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
//        int[] res = new int[2];
//        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//        for(int i = 0; i<nums.length;i++){
//            int num = nums[i];
//            int val = target - num;
//            if(map.containsKey(val)){
//                res[0] = map.get(val);
//                res[1] = i;
//                return res;
//            }else{
//                map.put(num,i);
//            }
//            System.out.println(map);
//        }
//        return res;

        int[] res = new int[2]; // 创建一个用来存放结果的数组

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); // 创建一个用来放数值与索引对应的map

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i]; // 当前数字
            int pairNum = target - num; // 匹配当前数字的数字
            if (map.containsKey(pairNum)) { // 查看map里边是否有匹配当前数字的数字
                res[0] = map.get(pairNum);  // 获取匹配数组的索引作为第一个返回值
                res[1] = i;  // 获取当前数字的索引作为第二个返回值
                return res; //返回结果，跳出循环
            } else {
                map.put(num, i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = test.twoSum(nums, target);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
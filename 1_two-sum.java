import java.util.*;

class TwoSum {

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 1 };
        int target = 6;

        int[] res = twoSum(nums, target);
        System.err.println("result: " + res[0] + " " + res[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int searchEle = target - nums[i];
            if (numMap.containsKey(searchEle) && numMap.get(searchEle) != i) {
                return new int[] { i, numMap.get(searchEle) };
            }
        }

        return new int[] {};
    }
}
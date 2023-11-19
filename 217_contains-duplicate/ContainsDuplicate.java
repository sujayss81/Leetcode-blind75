import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        boolean res = containsDuplicate(nums);
        System.out.println(res);
    }

    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == nums[i + 1])
                return true;

        return false;
    }
}

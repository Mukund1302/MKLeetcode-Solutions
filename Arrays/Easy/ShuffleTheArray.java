package Arrays.Easy;

import java.util.Arrays;

public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int start = 0;
        int mid = n;
        int index = 0;

        int[] ans = new int[nums.length];

        while (mid < nums.length) {
            ans[index++] = nums[start++];
            ans[index++] = nums[mid++];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = shuffle(nums, n);
        System.out.println(Arrays.toString(result));
    }
}

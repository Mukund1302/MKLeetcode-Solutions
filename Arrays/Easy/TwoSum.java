package Arrays.Easy;
import java.util.*;
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (hm.containsKey(diff)) {
                output[0] = hm.get(diff);
                output[1] = i;
                break;
            } else {
                hm.put(nums[i], i);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}

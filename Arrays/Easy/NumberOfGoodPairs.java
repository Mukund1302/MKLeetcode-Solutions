package Arrays.Easy;

import java.util.HashMap;

public class NumberOfGoodPairs {

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                count += hm.get(nums[i]);
            }
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums));
    }

}
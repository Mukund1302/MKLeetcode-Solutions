package Arrays.Easy;
import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int uniqueIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!hs.contains(nums[i])) {
                hs.add(nums[i]);
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int k = removeDuplicates(nums);
        System.out.println(k); // Output: 2

        // Print first k elements of the modified array
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k))); // Output: [1, 2]
    }
}

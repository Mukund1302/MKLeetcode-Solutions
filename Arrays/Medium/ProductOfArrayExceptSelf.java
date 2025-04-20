package Arrays.Medium;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        for (int current = 0; current < nums.length; current++) {
            int total = 1;
            for (int i = 0; i < nums.length; i++) {
                if (i != current) {
                    total *= nums[i];
                }
            }
            output[current] = total;
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}

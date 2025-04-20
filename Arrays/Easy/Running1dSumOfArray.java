package Arrays.Easy;
import java.util.Arrays;

public class Running1dSumOfArray {


        public int[] runningSum(int[] nums) {
            int sum = 0;

            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                nums[i] = sum;
            }
            return nums;
        }

        public static void main(String[] args) {
            Running1dSumOfArray sol = new Running1dSumOfArray();
            int[] nums = {1, 2, 3, 4};
            int[] result = sol.runningSum(nums);
            System.out.println(Arrays.toString(result));
        }
    }


package Arrays.Easy;
import java.util.Arrays;

public class ConcatenationOfArray {
        public int[] getConcatenation(int[] nums) {
            int[] ans = new int[2*nums.length];

            for(int i=0; i<nums.length; i++){
                ans[i]=nums[i];
                ans[i+nums.length] = nums[i];
            }

            return ans;
        }


public static void main(String[] args) {
    ConcatenationOfArray obj = new ConcatenationOfArray();
    int[] nums = {1, 2, 1};
    int[] result = obj.getConcatenation(nums);
    System.out.println(Arrays.toString(result));
}


}

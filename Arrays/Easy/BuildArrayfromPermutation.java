package Arrays.Easy;

public class BuildArrayfromPermutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    // This is the entry point for running your code
    public static void main(String[] args) {
        BuildArrayfromPermutation obj = new BuildArrayfromPermutation();

        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = obj.buildArray(nums);

        // Print output
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

package Arrays.Easy;

public class FindNumbersWithEvenNumberofDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (isEven(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isEven(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    public static int digits(int num) {
        if (num < 0) {
            num = -num;
        }
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }
}

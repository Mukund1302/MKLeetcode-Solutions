package Arrays.Easy;

public class MinimumCostToMoveChipsToTheSamePosition {
    public static int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;

        for (int i : position) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return Math.min(even, odd);
    }

    public static void main(String[] args) {
        int[] position = {1, 2, 3};
        System.out.println(minCostToMoveChips(position));
    }
}

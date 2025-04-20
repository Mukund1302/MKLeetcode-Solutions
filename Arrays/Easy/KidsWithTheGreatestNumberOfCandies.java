package Arrays.Easy;

import java.util.*;

public class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> resultList = new ArrayList<>();
        int maximcandies = findMaxCandies(candies);

        for (int i = 0; i < candies.length; i++) {
            resultList.add(candies[i] + extraCandies >= maximcandies);
        }

        return resultList;
    }

    public static int findMaxCandies(int[] candies) {
        int maxcandies = 0;
        for (int candy : candies) {
            maxcandies = Math.max(candy, maxcandies);
        }
        return maxcandies;
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }
}

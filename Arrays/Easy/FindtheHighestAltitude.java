package Arrays.Easy;

public class FindtheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        int currentAlt = 0;
        int highestPt = 0;

        for (int altGain : gain) {
            currentAlt += altGain;
            highestPt = Math.max(highestPt, currentAlt);
        }

        return highestPt;
    }

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));
    }
}

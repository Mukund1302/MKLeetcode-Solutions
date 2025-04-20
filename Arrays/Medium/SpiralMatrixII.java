package Arrays.Medium;
import java.util.Arrays;
public class SpiralMatrixII {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int rowBegin = 0;
        int colBegin = 0;
        int rowEnd = n - 1;
        int colEnd = n - 1;
        int element = 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse Right
            for (int j = colBegin; j <= colEnd; j++) {
                matrix[rowBegin][j] = element++;
            }
            rowBegin++;

            // Traverse Down
            for (int j = rowBegin; j <= rowEnd; j++) {
                matrix[j][colEnd] = element++;
            }
            colEnd--;

            // Traverse Left
            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--) {
                    matrix[rowEnd][j] = element++;
                }
                rowEnd--;
            }

            // Traverse Up
            if (colBegin <= colEnd) {
                for (int j = rowEnd; j >= rowBegin; j--) {
                    matrix[j][colBegin] = element++;
                }
                colBegin++;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] result = generateMatrix(n);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}

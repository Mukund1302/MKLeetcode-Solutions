package Arrays.Medium;
import java.util.*;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();

        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length-1;

        while(rowBegin <= rowEnd && colBegin <= colEnd){

//TRAVERSE RIGHT
            for(int j = colBegin; j<=colEnd; j++){
                res.add(matrix[rowBegin][j]);
            }rowBegin++;
//TRAVERSE DOWN
            for(int j = rowBegin; j<= rowEnd; j++){
                res.add(matrix[j][colEnd]);
            }colEnd--;
//TRAVERSE LEFT
            if(rowBegin<=rowEnd){
                for(int j = colEnd; j>=colBegin; j--){
                    res.add(matrix[rowEnd][j]);
                }
            }rowEnd--;
//TRAVERSE UP

            if(colBegin<=colEnd){
                for(int j = rowEnd; j>= rowBegin; j--){
                    res.add(matrix[j][colBegin]);
                }
            }colBegin++;

        }
        return res;
    }

    public static void main(String[] args) {

        SpiralMatrix sm = new SpiralMatrix();

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> result = sm.spiralOrder(matrix);
        System.out.println(result);
    }
}

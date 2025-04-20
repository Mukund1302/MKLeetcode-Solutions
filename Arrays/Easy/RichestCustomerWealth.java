package Arrays.Easy;

public class RichestCustomerWealth {

    public int maximumWealth(int[][] acc) {
        int max=0;

        for(int i=0; i < acc.length; i++ ){
            int sum=0;
            for (int j=0; j < acc[i].length; j++){
                sum = sum + acc[i][j];

                max = Math.max(max,sum);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        RichestCustomerWealth sol = new RichestCustomerWealth();
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };
        System.out.println(sol.maximumWealth(accounts));
    }

}

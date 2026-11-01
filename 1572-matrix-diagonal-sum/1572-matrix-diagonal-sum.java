class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < mat.length; i++) {
            //   for(int j =0 ;j<mat.length;j++) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];

            //    }
        }
        if (n % 2 != 0) {
            sum -= mat[mat.length / 2][mat.length / 2];
        }
        return sum;
    }
}
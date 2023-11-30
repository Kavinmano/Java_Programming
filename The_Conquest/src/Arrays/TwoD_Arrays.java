package Arrays;

public class TwoD_Arrays {
    public static void main(String[] args) {
        int [][] matrix = new int[5][2]; // Declared 5 rows and 2 columns matrix
        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[4][0]=5;

        for(int i=0;i<5;i++)
        {
            for(int j =0;j<2;j++)
            {
                System.out.println(matrix[i][j]);
            }
        }
    }
}

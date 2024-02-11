public class Matrix {
    public static void main(String[] args) {
        int r = 3;
        int c = 3;
        int arr1[][] = { { 1, 2, 3 }, { 4, 5, 8 }, { 4, 9, 9 } };
        int arr2[][] = { { 9, 8, 3 }, { 7, 6, 7 }, { 4, 4, 2 } };
        int mult[][] = new int[r][c];
        for (int i = 0; i < r; i++) { // for row which increase the row arr[0,0] arr[1,0]

            for (int j = 0; j < c; j++) { // for column arr[0,0] arr[0,1]

                for (int k = 0; k < c; k++) { // for changing the columb
                    mult[i][j] += arr1[i][k] * arr2[k][j];
                }
            }

        }
        for (int[] val : mult) {
            for (int col : val) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }
}
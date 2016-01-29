package ExamPreparation;

/**
 * Created by emaktse on 28.01.2016.
 */

/**
 * Write a method in Java to generate an integer matrix of size n x n
 * (n is a parameter of the method) elements of which are calculated
 * by finding a minimum of the row index and the column index of the element (indices start from zero).
 */
public class Matrix_Elements_Min_Of_Col_Row {
    public static void main (String[] args) {
        int[][] res = muster (9);
    }

    public static int[][] muster (int n) {
        int[][] Array = new int[n][n];
        System.out.println("N= " + n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Array[i][j] = Math.min(i,j);
                System.out.printf("%5d ", Array[i][j]);
            }
            System.out.println();
        }
        return Array;

    }
}

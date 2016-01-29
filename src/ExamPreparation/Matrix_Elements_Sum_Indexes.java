package ExamPreparation;

/**
 * Created by emaktse on 27.01.2016.
 * /**
 * Write a method in Java to generate an integer matrix of size n x n (n is a parameter of the method)
 * elements of which are calculated by adding the row index and the column index of the element
 * (indices start from zero).
 */
public class Matrix_Elements_Sum_Indexes {

    public static void main (String[] args) {
        int[][] res = liitmisTabel (9);
    }

    public static int[][] liitmisTabel (int n){
        int[][] Array = new int[n][n];
        System.out.println("N= " + n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Array[i][j] = (i + j);
                System.out.printf("%5d ", Array[i][j]);
            }
            System.out.println();
        }
        return Array;
    }
}

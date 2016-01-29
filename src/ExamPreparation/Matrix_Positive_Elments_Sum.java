package ExamPreparation;

/**
 * Created by emaktse on 27.01.2016.
 */
public class Matrix_Positive_Elments_Sum {

    public static void main (String[] args) {
        System.out.println (posElArv (new int[]{1, -2, 3}));
        // YOUR TESTS HERE
    }

    public static int posElArv (int[] m) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] > 0){
                count++;
            }
        }
        return count;
    }
}

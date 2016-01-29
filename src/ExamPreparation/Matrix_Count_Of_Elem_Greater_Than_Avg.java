package ExamPreparation;

/**
 * Created by emaktse on 27.01.2016.
 */
public class Matrix_Count_Of_Elem_Greater_Than_Avg {
    public static void main (String[] args) {
        System.out.println (keskmisestParemaid (new double[]{0, 1, 2}));
        // YOUR TESTS HERE
    }


    public static int keskmisestParemaid (double[] d) {
        int count = 0;
        double avg = 0;
        double sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum = sum + d[i];
        }
        avg = sum / d.length;
        for (int i = 0; i < d.length; i++) {
            if (d[i] > avg){
                count++;
            }
        }

        return count;

    }
}

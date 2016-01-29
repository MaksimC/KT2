package ExamPreparation;

import java.util.Arrays;

/**
 * Created by emaktse on 27.01.2016.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println (result (new double[]{0., 1., 2., 3., 4.}));
        // YOUR TESTS HERE
    }

    public static double result (double[] marks) {
        double[] array = new double[marks.length];
        for (int i = 0; i < marks.length; i++) {
            array[i] = marks[i];
        }
        Arrays.sort(array);


        double sum = 0;

        for (int i = 1; i < array.length-1; i++) {
            sum = sum + array[i];
        }
        double  avg = sum/array.length-2;
        return avg;
    }

}

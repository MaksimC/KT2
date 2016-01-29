package ExamPreparation;

/**
 * Created by emaktse on 29.01.2016.
 *
 * There are n>2 judges and each gives a mark to sportsmans performance. T
 * wo extreme marks (one highest and one lowest) are removed and arithmetical mean of remaining n-2 marks is calculated.
 Write a Java method to determine the sportsmans result.
 Do not change the array given as argument.
 *
 */

public class Matrix_Sort_Sportsman_avg {

    public static void main (String[] args) {
        System.out.println (result (new double[]{0., 1., 2., 3., 4.}));
        // YOUR TESTS HERE
    }

    public static double result (double[] marks) {
        double avg = 0;
        double sum = 0;
        double [] array = new double[marks.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = marks[i];
        }

        boolean swapped = true;
        int j = 0;
        double tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        for (int i = 1; i < array.length-1; i++) {
            sum = sum + array[i];
        }
        avg = sum / (array.length-2);

        return avg;
    }
}

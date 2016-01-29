package ExamPreparation;

/**
 * Created by emaktse on 29.01.2016.
 *
 * Sportsmans score is calculated as sum of points from different attempts and two worst attempts are not counted (there are more than two attempts).
 Write a Java method to calculate the score if an array of points from all attempts is given.
 Do not change the array given as parameter.
 */

public class Matrix_Sort_Sportsman {

    public static void main (String[] args) {
        System.out.println (score (new int[]{4, 1, 2, 3, 0})); // 9
        // Your tests here
    }

    public static int score (int[] points) {
        int[] array = new int [points.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = points[i];
        }

        boolean swapped = true;
        int j = 0;
        int tmp;
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

        int sum = 0;
        for (int i = 1; i < array.length-1; i++) {
            sum = sum + array[i];
        }

        return sum;
    }
}

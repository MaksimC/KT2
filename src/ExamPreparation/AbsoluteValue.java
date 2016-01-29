package ExamPreparation;

/**
 * Created by emaktse on 27.01.2016.
 */
public class AbsoluteValue {

    public static void main (String[] args) {
        System.out.println (summaAbsv (-1, -3));
        // YOUR TESTS HERE
    }
    public static double summaAbsv (double a, double b) {
        double sum;
        sum = Math.abs(a+b);
        System.out.println(sum);
        return sum;  // TODO!!! YOUR PROGRAM HERE
    }
}

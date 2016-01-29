package ExamPreparation;

/**
 * Created by emaktse on 27.01.2016.
 */
public class If_Number_Is_In_Range {

    public static void main (String[] args) {
        System.out.println (kuulub_1_100 (0));
        // YOUR TESTS HERE
    }

    public static boolean kuulub_1_100 (int n) {
        if (n >= 1 && n<=100)
            return true;
        else
            return false;
    }
}

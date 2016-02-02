package Eksam_Variants;

/**
 * Created by emaktse on 01.02.2016.
 */
public class Nurgad {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(" "+Math.min(i, j));
            }
            System.out.println();
        }
    }
}

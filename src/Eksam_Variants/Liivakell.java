package Eksam_Variants;

/**
 * Created by emaktse on 01.02.2016.
 */
public class Liivakell {
    public static void main(String[] args) {
        int suurus = 90;
        for (int i = 0; i < suurus; i++) {
            for (int j = 0; j < suurus; j++) {
                if (i + j < suurus && i<=j) {
                    System.out.print("0");
                } else if (i + j >= suurus -1 && i >= j) {
                    System.out.print("0");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}

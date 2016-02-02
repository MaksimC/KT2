package Eksam_Variants;

/**
 * Created by emaktse on 02.02.2016.
 */
public class Zig_Zag2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == count) {
                    System.out.print("0");
                } else {
                    System.out.print(".");
                }
            }
            if (i / 9 % 2 == 0) {
                count += 1;
            } else {
                count += -1;
            }
            System.out.println();
        }
    }
}

package Eksam_Variants;

/**
 * Created by emaktse on 02.02.2016.
 */
public class Zig_Zag {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i + j - 10) % 20 == 9 || j == i % 20) {
                    System.out.print("0");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}

package Eksam_Variants;
/**
 * Prindi konsooli 10x100 maatriks, kus läheb joon sikk-sakk ülevalt alla.
 *
 * Näide:
 * x
 *  x
 *   x
 *    x
 *     x
 *      x
 *       x
 *        x
 *         x
 *          x
 *         x
 *        x
 *       x
 *      x
 *     x
 *    x
 *   x
 *  x
 * x
 *  x
 *   x
 *    x
 *     x
 *      jne.
 *
 * Kasuta mis iganes tähiseid soovid ülesande lahendamiseks.
 */
public class Matrix_V2 {

    public static void main(String[] args) {
        String[][]array = new String[100][10];
        for (int i = 0; i < 100; i++) {

            int m = i;

            while (m>18) {
                m = m - 18;
            }

            if (m < 10) {
                for (int j = 0; j < 10; j++) {
                    if (j == m) {
                        array[i][j] = "x";
                        System.out.print("x");
                    } else {
                        array[i][j] = " ";
                        System.out.print(array[i][j]);
                        System.out.println(m);
                    }
                }
                System.out.println();
            }
            if (m > 9) {
                for (int j = 0; j < 10; j++) {
                    if (j == 18 - m) {
                        array[i][j] = "x";
                        System.out.print("x");
                    } else {
                        array[i][j] = " ";
                        System.out.print(array[i][j]);
                        System.out.println(m);
                    }
                }
                System.out.println();
            }
        }
    }

}

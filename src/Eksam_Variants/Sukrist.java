package Eksam_Variants;

import java.util.Arrays;

/**
 * Created by emaktse on 02.02.2016.
 */
public class Sukrist {
    public static void main(String[] args) {
        int [][] maatriks = new int[10][10];

        int vastus = 1;
        for (int i = 0; i < maatriks.length; i++) {
            if (i==0 || i== 2 || i==4 || i==6 || i==8){
                for (int j = maatriks.length-1; j >= 0; j--) {
                    maatriks[i][j] = vastus;
                    vastus++;
                }
            } else {
                for (int j = 0; j <maatriks[i].length; j++) {

                    maatriks[i][j] = vastus;
                    vastus++;
                }
            }
            System.out.println(Arrays.toString(maatriks[i]));
        }
    }

}

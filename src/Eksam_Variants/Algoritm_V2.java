package Eksam_Variants;

/**
 * Created by emaktse on 29.01.2016.
 */
import java.util.Arrays;

/**
 * if, while, int[]
 * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
 * tegelikult 60 punkti, pead esiteks kõik suuremad arvud 60 peale ümardama.
 * Teiseks leia mitu tudengit said üle mediaani?
 */
public class Algoritm_V2 {

    // Main klass on ainult sulle endale testimiseks
    public static void main(String[] args) {

        System.out.println(yleMediaani(new int[]{19, 45, 55, 67, 89}));
        System.out.println(yleMediaani(new int[]{55, 23, 88, 56, 43, 90, 34}));
        System.out.println(yleMediaani(new int[]{21, 85, 45}));
        System.out.println(yleMediaani(new int[]{10, 20, 30, 40}));

    }

    // Siia meetodi sisse kirjuta lahendus.
    private static int yleMediaani(int[] ints) {
        double median = 0;
        int arrayMiddle = ints.length/2;
        int studentCount = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 60){
                ints [i] = 60;
            }
        }
        Arrays.sort(ints);
        if (ints.length%2 == 1)
            median = ints[arrayMiddle];
        else
            median = (ints[arrayMiddle-1] + ints[arrayMiddle]) / 2;

        System.out.println(median);
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > median)
                studentCount++;
        }

        return studentCount;
    }
}


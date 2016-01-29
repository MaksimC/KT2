package Eksam_Variants;

/**
 * Created by emaktse on 29.01.2016.
 */
public class Algoritm_Eksam_V1 {
    /**
     * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
     * tegelikult 60 punkti, pead esiteks kõik suuremad arvud 60 peale ümardama.
     * Teiseks leia mitu tudengit said alla keskmise iga grupi kohta?
     */

        // Main klass on ainult sulle endale testimiseks
        public static void main(String[] args) {

            System.out.println(allaKeskmise(new int[]{19, 45, 55, 67, 89}));
            System.out.println(allaKeskmise(new int[]{55, 23, 88, 56, 43, 90, 34}));
            System.out.println(allaKeskmise(new int[]{21, 85, 45}));

        }

        // Siia meetodi sisse kirjuta lahendus.
        private static int allaKeskmise(int[] ints) {

            int sum = 0;
            int average = 0;
            int studentCount = 0;

            for (int i = 0; i < ints.length; i++) {
                if (ints[i]>60){
                    ints[i] = 60;
                }
            }
            for (int i = 0; i < ints.length; i++) {
                sum = sum + ints[i];
            }
            average = sum / ints.length;

            for (int i = 0; i < ints.length; i++) {
                if (ints[i] < average){
                    studentCount++;
                }
            }

            return studentCount;
        }
}

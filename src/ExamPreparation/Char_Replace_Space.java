package ExamPreparation;

/**
 * Created by emaktse on 29.01.2016.
 *
 * Replace all chars "space" in the given string to char '-'.
 */
public class Char_Replace_Space {

    public static void main (String[] args) {
        String s = "Tere, TUDENG,   tore ARVUTI sul!";
        String t = asenda (s); // "Tere,-TUDENG,---tore-ARVUTI-sul!"
        System.out.println (s + " > " + t);
    }

    public static String asenda (String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isSpaceChar(s.charAt(i))) {
                stringBuilder.append('-');
            } else stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}

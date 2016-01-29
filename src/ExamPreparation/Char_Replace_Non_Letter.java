package ExamPreparation;

/**
 * Created by emaktse on 29.01.2016.
 *
 * /**
 * Write a Java method to replace all non-letters in a given string s by symbol '*'.
 The solution must use a loop.
 */
public class Char_Replace_Non_Letter {
    public static void main (String[] args) {
        String s = "Tere, TUDENG, 1234!";
        String t = asenda (s); // "Tere**TUDENG*******"
        System.out.println (s + " > " + t);
    }

    public static String asenda (String s) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))){
                stringBuilder.append(s.charAt(i));
            }else stringBuilder.append('*');

            }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString(); // TODO!!! Your code here
    }
}

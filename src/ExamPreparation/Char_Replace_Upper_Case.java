package ExamPreparation;

/**
 * Created by emaktse on 27.01.2016.
 */
public class Char_Replace_Upper_Case {


    public static void startMethod () {
        String s = "Tere, TUDENG!";
        String t = asenda (s); // "_ere, ______!"
        System.out.println (s + " --> " + t);
    }

    public static String asenda (String s) {
        if(null == s || s.isEmpty() ){
            System.out.println("String is empty!!");
        }
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))){
                stringBuilder.setCharAt(i, '_');
            }

        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString(); //
    }
}

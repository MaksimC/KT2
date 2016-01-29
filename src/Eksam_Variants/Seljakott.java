package Eksam_Variants;

/**
 * Created by emaktse on 29.01.2016.
 */
/**
 * Created by emaktse on 27.01.2016.
 */
public class Seljakott  {

    private String[] kotiSisu = new String[100];
    private String omanikuNimiG;

    Seljakott(String omanikuNimi) {

        omanikuNimiG = omanikuNimi;
    }

    String omanikuNimi(){
        String omanik = omanikuNimiG;

        return omanik;
    }

    void lisaAsi(String item){
        for (int i = 0; i < kotiSisu.length; i++) {
            if (kotiSisu[i] == null) {
                kotiSisu[i] = item;
                break;
            }
        }
    }

    void eemaldaAsi (String item){
        for (int i = 0; i < kotiSisu.length; i++) {
            if (kotiSisu[i] == item){
                kotiSisu[i] = null;
            }
        }

    }

    void rebene (){
        for (int i = 0; i < kotiSisu.length; i++) {
            kotiSisu[i] = null;
        }
        System.out.println("\n"+"Your backpack is fucked up! You have lost all your loot!"+"\n");
    }
    StringBuilder misOnKotis(){
        int count = 0;
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < kotiSisu.length; i++) {
            if (kotiSisu[i]!= null){
                stringbuilder.append(kotiSisu[i] + ", ");
                count++;
            }
        }
        if (count == 0){
            stringbuilder.append("Your backpack is empty!");
        }
        return stringbuilder;
    }

    String mituAsjaOnKotis(){
        int count = 0;
        String tuhi = new String("Your Backpack is empty!");
        String kogus = new String();

        for (int i = 0; i < kotiSisu.length; i++) {
            if (kotiSisu[i] != null) {
                count++;
            }
        }
        if (count == 0){
            return tuhi;
        }
        return kogus.valueOf(count);
    }
}

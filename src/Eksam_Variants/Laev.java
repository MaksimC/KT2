package Eksam_Variants;

/**
 * Created by emaktse on 29.01.2016.
 */
public class Laev {

    private String[] laev = new String[20];
    private String laevaNimi;

    Laev(String shipName){
        laevaNimi = shipName;
    }

    void lisaReisija(String reisija){
        for (int i = 0; i < laev.length; i++) {
            if (laev[i] == null){
                laev[i] = reisija;
                break;
            }
        }
    }


    void eemaldaReisija(String reisija){
        for (int i = 0; i < laev.length; i++) {
            if (laev[i] == reisija) {
                laev[i] = null;
            }
        }
    }

    String misNimi(){
        return laevaNimi;
    }


    void kalaHammustasKummipaatiAugu(){

        for (int i = 0; i < laev.length; i++) {
            laev[i] = null;
        }
    }


    StringBuilder votaReisijad(){
        int count =0;
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < laev.length; i++) {
            if (laev[i] != null) {
                stringbuilder.append(laev[i]+", ");
                count++;
            }
        }
        if (count == 0){
            stringbuilder.append("Laev on tuhi!");
        }
        return stringbuilder;
    }

    String reisijateArv(){
        String reisijateArvString = "";
        String tuhi = "Laev on tuhi!";
        int count =0;
        for (int i = 0; i < laev.length; i++) {
            if (laev[i] != null){
                count++;
            }
        }
        if (count == 0){
            return tuhi;
        }

        return reisijateArvString.valueOf(count);
    }

}

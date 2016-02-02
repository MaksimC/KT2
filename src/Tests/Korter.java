package Tests;

/**
 * Created by emaktse on 02.02.2016.
 */
public class Korter {

    int korteriMahtuvus;
    String[] kulalised;

    Korter(int mahtuvus){
        korteriMahtuvus = mahtuvus;
        kulalised = new String[korteriMahtuvus];
        System.out.println("massivi pikkus on: " + kulalised.length);
        System.out.println("mahtuvus vaartus on " + korteriMahtuvus);
    }

    public void print (){
        System.out.println("uus massiivi pikkus on: " + kulalised.length);

    }

}

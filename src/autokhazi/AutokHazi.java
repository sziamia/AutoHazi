package autokhazi;

import java.util.ArrayList;

public class AutokHazi {
    public static void main(String[] args) {
        ArrayList<String> parkoloAutok = new ArrayList<>();
        
        Autok auto = new Autok();
        //System.out.println(proba.general());
        
        // sajat auto hozzaadasa
        parkoloAutok.add(0, "Renault - cabrio - 1996\n");
        
        // arraylist feltöltése
        for (int i = 0; i < 10; i++) {
            parkoloAutok.add(auto.general());
        }
        
        // uj evjarat es szin hozzaadasa
        parkoloAutok.add(0, "Renault - cabrio - 1995 - zöld\n");
        
        System.out.println(parkoloAutok);
    }
}
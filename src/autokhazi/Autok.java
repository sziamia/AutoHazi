package autokhazi;

public class Autok {
    public String general(){
        String[] markak = {"Renault", "BMW", "Ford", "Tesla", "Mazda", "Nissan", "Toyota"};
        String[] kivitelek = {"Cabrio", "Sedan", "Busz", "Limusin"};
        String[] evjarat = {"2015", "2016", "2017", "2018"};
        
        int gen1 = (int)(Math.random() * markak.length);
        int gen2 = (int)(Math.random() * kivitelek.length);
        int gen3 = (int)(Math.random() * evjarat.length);
        
        String auto = markak[gen1] + " - " + kivitelek[gen2] + " - " + evjarat[gen3] + "\n";
        
        return auto;
    }
}

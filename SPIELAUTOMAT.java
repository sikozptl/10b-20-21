import java.util.Random;

public class SPIELAUTOMAT{
    //Attributliste
    private SPIELWALZE w1;
    private SPIELWALZE w2;
    private SPIELWALZE w3; 
    private Random zufgen;
    private int guthaben;
    private int spielnr;

    //Konstruktor
    public SPIELAUTOMAT()    {
        w1 = new SPIELWALZE(100,100,100,1);
        w2 = new SPIELWALZE(200,100,100,2);
        w3 = new SPIELWALZE(300,100,100,3);   
        zufgen = new Random();
        guthaben = 0;
        spielnr = 0;
    }

    //Methoden
    public int ermittleGewinn(){
        int farbe1 = w1.getFarbe();
        int farbe2 = w2.getFarbe();
        int farbe3 = w3.getFarbe();

        // Wenn Farbe1 gleich Farbe 2 und Farbe 2 gleich Farbe 3 ist ... 10 EUR
        if( (farbe1 == farbe2) && (farbe2 == farbe3) ){
            return 10;
        }else{
            if( (farbe1==farbe3) || (farbe2==farbe3) || (farbe1==farbe2)){
                return 2;
                //guthaben = guthaben +2;
            }else{
                return 0;
            }
        }
    }

    public void setzeFarbmuster(int farbe1, int farbe2, int farbe3){
        w1.faerbeUm(farbe1);
        w2.faerbeUm(farbe2);
        w3.faerbeUm(farbe3);        
    }

    public void einzahlen(int betrag){
        guthaben = guthaben + betrag;
    }

    public void spiele(){
        if(guthaben > 0){
            //Ein Spiel kostet 1 EUR
            guthaben = guthaben -1;
            //Farbmuster neu generieren
            setzeFarbmuster(zufgen.nextInt(9),zufgen.nextInt(9),zufgen.nextInt(9));
            //Gewinn addieren
            guthaben = guthaben + ermittleGewinn();
            //Werte ausgeben
            schreibeWerte();
            spielnr = spielnr +1;
        }else{
            System.out.println("Alles verzockt! Wirf mehr Geld ein!");
        }
    }

    /** Wiederhole spiele() bis großer Gewinn 
     *  Die Sequenz wird so lange wiederholt, solange die Bedingung wahr ist
     *  Wiederholt werden soll ... solange der Gewinn kleiner als 10 ist und
     *  das Guthaben größer 0 ist */
    public void gewinneSicher(){
        while( (ermittleGewinn() < 10) && (guthaben > 0) ){
            spiele();
        }
    }

    /** Spielt weiter, solange Guthaben vorhanden ist */
    public void spieleSelbst(){
        while(guthaben > 0){
            spiele();
        }
    }

    /** Spielt n mal */
    public void spielenmmal(int n){
        int i = 0;
        while(i<n){
            spiele();
            i++; // i = i+1;
        }
    }

    /** Spielt auch n mal */
    public void spielenmal2(int n){
        for(int i=0; i<n; i++){
            spiele();
        }
    }

    private void schreibeWerte(){
        System.out.println(spielnr + ". " +
            " Farben: " + w1.getFarbe() + w2.getFarbe() + w3.getFarbe() +
            " Gewinn: " + ermittleGewinn() + " Guthaben: " + guthaben
        );
    }
}

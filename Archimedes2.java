import java.lang.Math;
import java.math.*;

public class Archimedes2{

    //Attributliste
    BigDecimal n; //Anzahl der Ecken
    BigDecimal un; //Umfang des n-Ecks mit Radius 0.5, Näherung Pi
    long eckemax;
    
    //Konstruktor
    public Archimedes2(){
        //Startwerte
        n= new BigDecimal(6);
        un=new BigDecimal(3.0);
        eckemax = 500000000;
        berechneUmfang2nEck();
    }

    //Methoden
    //Formel        u_2n = (2*u_n)/(WURZEL(2+2*WURZEL(1-(u_n/n)^2))
    //  un = un +1; Neuer Wert = Alter Wert +1
    public void berechneUmfang2nEck(){

        MathContext mc = new MathContext(128);
        
        while(true){
            //Reihenfolge beachten! 
            //un = (2*un)/(Math.sqrt(2+2*Math.sqrt(1-(un/n)*(un/n))));
            
            BigDecimal eins = new BigDecimal(1);
            BigDecimal zwei = new BigDecimal(2);
            
            BigDecimal zaehler = (un.multiply(zwei));
            BigDecimal snhzwei = ((eins).subtract((un.divide(n,mc)).pow(2))).sqrt(mc);
            BigDecimal nenner = ((zwei.add((zwei).multiply(snhzwei))).sqrt(mc));
            
            un = zaehler.divide(nenner,mc);
            
            n = n.multiply(new BigDecimal(2));
            System.out.println("n: " + n + " Umfang: " + un);
        }
    }
}

import java.lang.Math;
public class Archimedes{

    //Attributliste
    int n; //Anzahl der Ecken
    double un; //Umfang des n-Ecks mit Radius 0.5, Näherung Pi

    //Konstruktor
    public Archimedes(){
        //Startwerte
        n=6;
        un=3.0;
    }

    //Methoden
    //Formel        u_2n = (2*u_n)/(WURZEL(2+2*WURZEL(1-(u_n/n)^2))
    //  un = un +1; Neuer Wert = Alter Wert +1
    public void berechneUmfang2nEck(){

        while(n<500000000){
            //Reihenfolge beachten! 
            un = (2*un)/(Math.sqrt(2+2*Math.sqrt(1-(un/n)*(un/n))));
            n = 2*n;
            System.out.println("n: " + n + " Umfang: " + un);
        }
    }
}

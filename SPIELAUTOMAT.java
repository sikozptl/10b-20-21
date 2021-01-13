import java.util.Random;

public class SPIELAUTOMAT{
    //Attributliste
    private SPIELWALZE w1;
    private SPIELWALZE w2;
    private SPIELWALZE w3; 
    private Random zufgen;
    
    //Konstruktor
    public SPIELAUTOMAT()    {
        w1 = new SPIELWALZE(100,100,100,1);
        w2 = new SPIELWALZE(200,100,100,2);
        w3 = new SPIELWALZE(300,100,100,3);   
        zufgen = new Random();
    }
    
    //Methoden
    public int ermittleGewinn(){
        int farbe1 = w1.getFarbe();
        int farbe2 = w2.getFarbe();
        int farbe3 = w3.getFarbe();
        
        // && und
        // || oder
        if( (farbe1 == farbe2) && (farbe2 == farbe3) ){
            return 10;
        }else{
            if( (farbe1==farbe3) || (farbe2==farbe3) || (farbe1==farbe2)){
                return 2;
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
    
    public void spiele(){
        // int zahl1 = zufgen.nextInt(9);
        // int zahl2 = zufgen.nextInt(9);
        // int zahl3 = zufgen.nextInt(9);
        // setzeFarbmuster(zahl1, zahl2, zahl3);
        setzeFarbmuster(zufgen.nextInt(9),zufgen.nextInt(9),zufgen.nextInt(9));
        schreibeWerte();
    }
    
    private void schreibeWerte(){
        System.out.println(
        " Farbe 1: " + w1.getFarbe() +
        " Farbe 2: " + w2.getFarbe() +
        " Farbe 3: " + w3.getFarbe() +
        " Gewinn: " + ermittleGewinn()
        );
    }
}

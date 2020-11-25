public class SPIELAUTOMAT{
    //Attributliste
    private SPIELWALZE w1;
    private SPIELWALZE w2;
    private SPIELWALZE w3;    
    
    //Konstruktor
    public SPIELAUTOMAT()    {
        w1 = new SPIELWALZE(100,100,100,1);
        w2 = new SPIELWALZE(200,100,100,2);
        w3 = new SPIELWALZE(300,100,100,3);        
    }
    
    //Methoden
    public void setzeFarbmuster(int farbe1, int farbe2, int farbe3){
        w1.faerbeUm(farbe1);
        w2.faerbeUm(farbe2);
        w3.faerbeUm(farbe3);        
    }
    
    public void schreibeWerte(){
        System.out.println(
        " Farbe 1: " + w1.getFarbe() +
        " Farbe 2: " + w2.getFarbe() +
        " Farbe 3: " + w3.getFarbe() 
        );
    }
}

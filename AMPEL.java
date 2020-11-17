public class AMPEL{
    //Attributliste
    private SPIELWALZE walze1;
    private SPIELWALZE walze2;
    private SPIELWALZE walze3;    

    //Konstruktor
    public AMPEL(){
        walze1 = new SPIELWALZE(100,100,100,4);
        walze2 = new SPIELWALZE(100,200,100,6);
        walze3 = new SPIELWALZE(100,300,100,2);
    }
    
    //Methoden
    //0 schwarz 1 blau 2 gruen 3 hellblau 4 rot
    //5 pink 6 gelb 7 grau 8 weiß 9 schwarz
    public void schalteGruen(){
     
    }

}

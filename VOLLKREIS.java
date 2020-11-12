 
public class VOLLKREIS
{
    //Attributliste
    private int xMitte; // x-Koordinate Mittelpunkt
    private int yMitte; 
    private int radius;
    private int farbnr;

    //Konstruktor
    //Farbnummer: 
    //0 schwarz 1 blau 2 gruen 3 hellblau 4 rot
    //5 pink 6 gelb 7 grau 8 weiß 9 schwarz
    public VOLLKREIS(){
        xMitte = 300;
        yMitte = 300;
        radius = 95;
        farbnr = 5;
        zeichne();    
    }
    
    
    public VOLLKREIS(int xStart, int yStart, int radiusStart, int farbnrStart)
    {
        xMitte = xStart;
        yMitte = yStart;
        radius = radiusStart;
        farbnr = farbnrStart;
        zeichne();
    }
    
    //Methoden
    public int getFarbe(){
        return farbnr;
    }

    public void setzeMitte(int xNeu, int yNeu)
    {
        xMitte = xNeu;
        yMitte = yNeu;
        zeichne();
    }
        
    public void zeichne()
    {
        ZEICHENFENSTER.gibFenster().fuelleKreis(xMitte,yMitte,radius,farbnr);
    }   

    public void setzeFarbe(int farbnrNeu)
    {
        farbnr = farbnrNeu;
        zeichne(); //zeichnen Methode aufrufen
    }
    
    public void verschiebe(int nachRechts, int nachUnten)
    {
       xMitte = xMitte + nachRechts;
       yMitte = yMitte + nachUnten;
       zeichne();
    }
}
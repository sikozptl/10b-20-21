 
public class KASTEN
{
    //Attribute
    private int links;
    private int oben;
    private int breite;
    private int hoehe;
    
    //Konstruktor 1
    public KASTEN()
    {
        links = 200;
        oben = 200;
        breite = 200;
        hoehe = 200;
        zeichne();
    }

    //Konstruktor 2
    public KASTEN(int linksStart, int obenStart, int breiteStart, int hoeheStart)
    {
        links = linksStart;
        oben = obenStart;
        breite = breiteStart;
        hoehe = hoeheStart;
        zeichne();
    }

    public void zeichne()
    {
        ZEICHENFENSTER.gibFenster().zeichneRechteck(links,oben,breite,hoehe);
    }
    
    public void setzeLinks(int linksNeu)
    {
        links = linksNeu;
        zeichne();
    }
    
    public void setzeRechts(int rechtsNeu)
    {
        links = rechtsNeu-breite;
        zeichne();        
    }
    
    public void setzeGroesse(int breiteNeu, int hoeheNeu)
    {
        breite = breiteNeu;
        hoehe = hoeheNeu;
        zeichne();        
    }
    
    public int gibUmfang()
    {
        return 2*(breite+hoehe);
    }
    
    public int gibInhalt()
    {
        return breite*hoehe;
    }
    
    public void verschiebe(int nachRechts, int nachUnten)
    {
        links = links + nachRechts;
        oben = oben + nachUnten;
        zeichne();        
    }
    
}
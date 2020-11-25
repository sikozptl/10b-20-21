public class SPIELWALZE{
    //Attribute
    //D.h. Jedes SPIELWALZE-Objekt hat ein
    //KASTEN-Objekt und ein VOLLKREIS-Objekt
    private KASTEN rahmen; //Datentyp Variablenname
    private VOLLKREIS lampe; //Referenzvariablen

    //1. Standardkonstruktor
    public SPIELWALZE(){
        //Wenn ein SPIELWALZE-Objekt erzeugt wird
        //soll ein KASTEN-Objekt und ein 
        //VOLLKREIS-OBJEKT erzeugt werden und mit
        //Referenzvariablen verknüpft werden
        rahmen = new KASTEN();
        lampe = new VOLLKREIS();
    }
    //2. Standardkonstruktor
    public SPIELWALZE(int linksStart, int obenStart, int breite, int farbnrStart){
        //Wenn ein SPIELWALZE-Objekt erzeugt wird
        //soll ein KASTEN-Objekt und ein 
        //VOLLKREIS-OBJEKT erzeugt werden und mit
        //Referenzvariablen verknüpft werden
    // KASTEN(int linksStart, int obenStart, int breiteStart, int hoeheStart)
        rahmen = new KASTEN(linksStart,obenStart,breite,breite);
    // VOLLKREIS(int xStart, int yStart, int radiusStart, int farbnrStart)
        lampe = new VOLLKREIS(linksStart+breite/2,obenStart+breite/2,breite/2-5,farbnrStart);
    }
    
    public void faerbeUm(int farbNrNeu){
        lampe.setzeFarbe(farbNrNeu);
    }

    public void verschiebe(int nachRechts, int nachUnten){
        //Verschiebe rahmen und lampe
        rahmen.verschiebe(nachRechts, nachUnten);
        lampe.verschiebe(nachRechts, nachUnten);
    }
    
    public int getFarbe(){
        return lampe.getFarbe();
    }
    
}

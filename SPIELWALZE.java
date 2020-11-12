public class SPIELWALZE{
    //Attribute
    //D.h. Jedes SPIELWALZE-Objekt hat ein
    //KASTEN-Objekt und ein VOLLKREIS-Objekt
    private KASTEN rahmen; //Datentyp Variablenname
    private VOLLKREIS lampe; //Referenzvariablen

    //Konstruktor
    public SPIELWALZE(){
        //Wenn ein SPIELWALZE-Objekt erzeugt wird
        //soll ein KASTEN-Objekt und ein 
        //VOLLKREIS-OBJEKT erzeugt werden und mit
        //Referenzvariablen verknüpft werden
        rahmen = new KASTEN();
        lampe = new VOLLKREIS();
    }
    
    public void faerbeUm(int farbNrNeu){
        lampe.setzeFarbe(farbNrNeu);
    }

}

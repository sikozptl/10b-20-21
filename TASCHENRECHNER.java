public class TASCHENRECHNER{
    //Attributliste
    double a;
    double b;

    //Konstruktor 2 (mit Eingabeparamtern)
    public TASCHENRECHNER(double wert1, double wert2){
        a = wert1;
        b = wert2;
    }    

    public static void main(String[] args){
        //Code schreiben für ein neues TR Objekt
        //und addiere zwei Zahlen mit dem neuen Objekt
        //Referenzvariable nicht vergessen
        TASCHENRECHNER tr = new TASCHENRECHNER(5.9, 2.0);
        System.out.println("Die Differenz von a= " + tr.a+ " und b= " + tr.b + " ist " + tr.subtrahieren());
        tr.werteAendern(2.0,3.0);
        System.out.println("Die Differenz von a= " + tr.a+ " und b= " + tr.b + " ist " + tr.subtrahieren());
    }
    
    //Schreibe eine Methode, mit der man die Attribute a und b ändern kann
    //und teste sie in der main methode    
    public void werteAendern(double wert1, double wert2){
        a = wert1;
        b = wert2;
    }
    
    //Schreibe eine Methode zum Subtrahieren und teste sie in der main Methode
    //Methode mit Rückgabewert
    public double subtrahieren()  {
        // berechnet Summe und gibt die Summe zurück
        return (a - b);
    }        
    
    //Methode mit Rückgabewert
    public double addieren()  {
        // berechnet Summe und gibt die Summe zurück
        return (a + b);
    }    
}

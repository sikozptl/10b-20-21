public class TASCHENRECHNER{

    //Konstruktor
    public TASCHENRECHNER()    {
        double a = 5.1;
        double b = 7.9;
        System.out.println("Summe ist:" + addieren(a,b) );
    }

    //Methode ohne Rückgabewert
    public void addieren(int x, int y)  {
        // gibt die Summe aus über Sop
        System.out.println("Summe ist:" + (x + y));
    }    
    
    //Methode mit Rückgabewert
    public double addieren(double x, double y)  {
        // berechnet Summe und gibt die Summe zurück
        return (x + y);
    }    
}

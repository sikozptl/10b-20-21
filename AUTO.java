public class AUTO extends KFZ{

    //Konstruktoren (kein Rückgabetyp, gleicher Name wie Klasse)
    public AUTO(){
        Farbe = "schwarz";
        Hersteller = "BMW";
        Hubraum = 2.0;
        Leistung = berechneLeistung();
        Geschwindigkeit = 0;
        MotorAn = false; //Motor läuft nicht
        Hoechstgeschwindigkeit = berechneHoechstgeschwindigkeit();
    }

    public AUTO(String NeueFarbe, String NeuerHersteller, double NeuerHubraum){
        Farbe = NeueFarbe;
        Hersteller = NeuerHersteller;
        Hubraum = NeuerHubraum;
        Leistung = berechneLeistung();
        Geschwindigkeit = 0;
        MotorAn = false; //Motor läuft nicht
        Hoechstgeschwindigkeit = berechneHoechstgeschwindigkeit();
    }    
    
    //das ist eine statische Methode, d.h.
    //main gehört nicht zum Objekt, sondern zur Klasse
    //Sie heisst main, weil sie das Hauptprogramm, oder der Startpunkt
    //einer Java-Anwendung ist.
    public static void main(String[] args){
        System.out.println("Ausgabe aus der main Methode");
        //Objekte erzeugen durch KonstruktorAufruf mit new
        //drei Referenzvariablen erzeugen und mit Objekt verknüpfen (=)
        AUTO auto1 = new AUTO("rosa", "VW", 0.6); //Aufruf 2. Konstruktor
        AUTO auto2 = new AUTO(); //Aufruf 1. Konstruktor
        AUTO auto3 = new AUTO("schwarz", "Skoda", 2.0); //Aufruf 2. Konstruktor
        
        auto1.startStop();
        auto1.beschleunigen(200);
        //Auto1 ausgeben
        System.out.println(auto1.toString());
        
        auto2.startStop();
        auto2.beschleunigen(40);
        System.out.println(auto2.toString());
    }

}

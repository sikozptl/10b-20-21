public class LKW extends KFZ{

        //Konstruktoren (kein Rückgabetyp, gleicher Name wie Klasse)
    public LKW(){
        Farbe = "schwarz";
        Hersteller = "BMW";
        Hubraum = 2.0;
        Leistung = berechneLeistung();
        Geschwindigkeit = 0;
        MotorAn = false; //Motor läuft nicht
        Hoechstgeschwindigkeit = berechneHoechstgeschwindigkeit();
    }
    
        public LKW(String NeueFarbe, String NeuerHersteller, double NeuerHubraum){
        Farbe = NeueFarbe;
        Hersteller = NeuerHersteller;
        Hubraum = NeuerHubraum;
        Leistung = berechneLeistung();
        Geschwindigkeit = 0;
        MotorAn = false; //Motor läuft nicht
        Hoechstgeschwindigkeit = berechneHoechstgeschwindigkeit();
    }    

}

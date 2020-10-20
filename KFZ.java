public abstract class KFZ extends FAHRZEUG{
    //Attribute 
    double Leistung;
    boolean MotorAn;
    double Hubraum;
    
    //Konstruktoren (kein Rückgabetyp, gleicher Name wie Klasse)
    public KFZ(){
        Farbe = "schwarz";
        Hersteller = "BMW";
        Hubraum = 2.0;
        Leistung = berechneLeistung();
        Geschwindigkeit = 0;
        MotorAn = false; //Motor läuft nicht
        Hoechstgeschwindigkeit = berechneHoechstgeschwindigkeit();
    }

    public KFZ(String NeueFarbe, String NeuerHersteller, double NeuerHubraum){
        Farbe = NeueFarbe;
        Hersteller = NeuerHersteller;
        Hubraum = NeuerHubraum;
        Leistung = berechneLeistung();
        Geschwindigkeit = 0;
        MotorAn = false; //Motor läuft nicht
        Hoechstgeschwindigkeit = berechneHoechstgeschwindigkeit();
    }        
    
    //Die toString-Methode liefert eine Textrepräsentation des Objekts
    public String toString(){
        return "KFZ-Objekt: " + Hersteller + " " + Farbe 
        + " " + Hubraum + " " + Geschwindigkeit;
    }
    
    public double berechneLeistung(){
        return Hubraum * 70.0;
    }
    
    public double berechneHoechstgeschwindigkeit(){
        if(2*Leistung <= 310){
            return 2*Leistung;
        }else{
            return 310;
        }
    }

    //Methoden
    public void startStop(){
        //Wenn Motor an ist, ausschalten und umgekehrt
        if(MotorAn == true){
            MotorAn = false;
            System.out.println("Motor geht aus!");            
        }else{
            MotorAn = true;
            System.out.println("Motor brummt!");
        }
    }    

    //Auto soll nur beschleunigen und bremsen, wenn Motor läuft
    public void beschleunigen(int kmh){
            if(MotorAn == true){
                super.beschleunigen(kmh);
            }else{
                System.out.println("Motor läuft nicht!");
            }//Prüfung MotorAn Ende
    }    
}

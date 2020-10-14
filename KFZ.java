public abstract class KFZ{
    //Attribute 
    String Farbe;
    String Hersteller;
    double Leistung;
    double Geschwindigkeit;
    boolean MotorAn;
    double Hoechstgeschwindigkeit;
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
        return "Auto-Objekt: " + Hersteller + " " + Farbe 
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
    public void beschleunigen(){
        beschleunigen(10);
    }

    //Auto soll nur beschleunigen und bremsen, wenn Motor läuft
    public void beschleunigen(int kmh){
        if(kmh>0){
            //Prüfen, ob Motor läuft (Vergleich mit ==)
            if(MotorAn == true){
                //Das Auto soll nie schneller als 80 fahren!
                if(Geschwindigkeit + kmh <= Hoechstgeschwindigkeit){
                    //neue Geschw = alte Geschw +10
                    // = heisst Zuweisung
                    Geschwindigkeit = Geschwindigkeit + kmh;
                    System.out.println("Neue Geschwindigkeit: " + Geschwindigkeit);
                }else{
                    Geschwindigkeit = Hoechstgeschwindigkeit;
                    System.out.println("Höchstgeschwindigkeit erreicht");
                }//Prüfung Geschwindigkeit Ende
            }else{
                System.out.println("Motor läuft nicht!");
            }//Prüfung MotorAn Ende
        }else{
            System.out.println("kmh muss positiv sein.");
        }
    }    

    public void setFarbe(String NeueFarbe){
        Farbe = NeueFarbe;
    }

    //Methode mit Eingabeparameter
    public void setHersteller(String NeuerHersteller){
        Hersteller = NeuerHersteller;
    }

    //Methode mit Eingabeparameterliste
    //die Methode soll alles Ändern, was sinnvollerweise geändert werden kann
    public void setAlles(String NeueFarbe, String NeuerHersteller,
    int NeueLeistung, int NeueHoechstgeschwindigkeit){
        Hersteller = NeuerHersteller;
        Farbe = NeueFarbe;
        Leistung = NeueLeistung;
        Hoechstgeschwindigkeit = NeueHoechstgeschwindigkeit;
    }

    public void bremsen(){
        bremsen(10);
    }    

    public void bremsen(int kmh){
        if(kmh>0){
            // Geschwindigkeit soll >= 0 bleiben
            if(Geschwindigkeit - kmh >= 0){
                Geschwindigkeit = Geschwindigkeit -kmh;
                System.out.println("Neue Geschwindigkeit: " + Geschwindigkeit);
            }else{
                Geschwindigkeit = 0;
                System.out.println("Neue Geschwindigkeit: " + Geschwindigkeit);
            }
        }else{
            System.out.println("kmh muss positiv sein.");
        }
    }        
    
}

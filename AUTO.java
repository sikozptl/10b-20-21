public class AUTO{
    //Attribute 
    String Farbe;
    String Hersteller;
    int Leistung;
    int Geschwindigkeit;
    boolean MotorAn;
    int Hoechstgeschwindigkeit;

    //Konstruktoren (kein Rückgabetyp, gleicher Name wie Klasse)
    public AUTO(){
        Farbe = "schwarz";
        Hersteller = "BMW";
        Leistung = 100;
        Geschwindigkeit = 0;
        MotorAn = false; //Motor läuft nicht
        Hoechstgeschwindigkeit = 60;
    }

    public AUTO(String NeueFarbe){
        Farbe = NeueFarbe;
        Hersteller = "BMW";
        Leistung = 100;
        Geschwindigkeit = 0;
        MotorAn = false; //Motor läuft nicht
        Hoechstgeschwindigkeit = 60;
    }    

    public AUTO(String NeueFarbe, String NeuerHersteller){
        Farbe = NeueFarbe;
        Hersteller = NeuerHersteller;
        Leistung = 100;
        Geschwindigkeit = 0;
        MotorAn = false; //Motor läuft nicht
        Hoechstgeschwindigkeit = 60;
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
                if(Geschwindigkeit < Hoechstgeschwindigkeit){
                    //neue Geschw = alte Geschw +10
                    // = heisst Zuweisung
                    Geschwindigkeit = Geschwindigkeit + kmh;
                }else{
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
        // Geschwindigkeit soll >= 0 bleiben
        if(Geschwindigkeit >= 10){
            Geschwindigkeit = Geschwindigkeit -10;        
        }
    }    
}

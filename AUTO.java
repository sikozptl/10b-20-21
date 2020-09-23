public class AUTO{
    //Attribute 
    String Farbe;
    String Hersteller;
    int Leistung;
    int Geschwindigkeit;
    boolean MotorAn;
    int Hoechstgeschwindigkeit;

    //Konstruktor
    public AUTO(){
        Farbe = "schwarz";
        Hersteller = "BMW";
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
        //Prüfen, ob Motor läuft (Vergleich mit ==)
        if(MotorAn == true){
            //Das Auto soll nie schneller als 80 fahren!
            if(Geschwindigkeit < Hoechstgeschwindigkeit){
                //neue Geschw = alte Geschw +10
                // = heisst Zuweisung
                Geschwindigkeit = Geschwindigkeit + 10;
            }else{
                System.out.println("Höchstgeschwindigkeit erreicht");
            }//Prüfung Geschwindigkeit Ende
        }else{
            System.out.println("Motor läuft nicht!");
        }//Prüfung MotorAn Ende
    }

    //Auto soll nur beschleunigen und bremsen, wenn Motor läuft
    public void beschleunigen(int kmh){
        //Prüfen, ob Motor läuft (Vergleich mit ==)
        if(MotorAn == true){
            //Das Auto soll nie schneller als 80 fahren!
            if(Geschwindigkeit < Hoechstgeschwindigkeit){
                //neue Geschw = alte Geschw +10
                // = heisst Zuweisung
                Geschwindigkeit = Geschwindigkeit + 10;
            }else{
                System.out.println("Höchstgeschwindigkeit erreicht");
            }//Prüfung Geschwindigkeit Ende
        }else{
            System.out.println("Motor läuft nicht!");
        }//Prüfung MotorAn Ende
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

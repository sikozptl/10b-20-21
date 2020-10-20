public abstract class FAHRZEUG{
    String Farbe;
    String Hersteller;
    double Geschwindigkeit;
    double Hoechstgeschwindigkeit; 

    public FAHRZEUG(){
        Farbe = "rosa";
        Hersteller = "Stevens";
        Geschwindigkeit = 0;
        Hoechstgeschwindigkeit = 100;
    }

    public void setFarbe(String NeueFarbe){
        Farbe = NeueFarbe;
    }

    //Methode mit Eingabeparameter
    public void setHersteller(String NeuerHersteller){
        Hersteller = NeuerHersteller;
    }    
    
    //Auto soll nur beschleunigen und bremsen, wenn Motor läuft
    public void beschleunigen(){
        beschleunigen(10);
    }

    //Auto soll nur beschleunigen und bremsen, wenn Motor läuft
    public void beschleunigen(int kmh){
        if(kmh>0){
            //Prüfen, ob Motor läuft (Vergleich mit ==)
            //if(MotorAn == true){
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
            //}else{
            //    System.out.println("Motor läuft nicht!");
            //}//Prüfung MotorAn Ende
        }else{
            System.out.println("kmh muss positiv sein.");
        }
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

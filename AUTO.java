public class AUTO{
    //Attribute 
    String Farbe;
    String Hersteller;
    int Leistung;
    int Geschwindigkeit;
    boolean MotorAn;

    //Konstruktor
    public AUTO(){
        Farbe = "schwarz";
        Hersteller = "BMW";
        Leistung = 100;
        Geschwindigkeit = 0;
        MotorAn = false; //Motor läuft nicht
    }

    //Methoden
    public void anlassen(){
        MotorAn = true;
        System.out.println("Auto macht brumm!");
    }
    
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
            if(Geschwindigkeit < 80){
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
    
    public void bremsen(){
        // Geschwindigkeit soll >= 0 bleiben
        if(Geschwindigkeit >= 10){
            Geschwindigkeit = Geschwindigkeit -10;        
        }
    }    
}

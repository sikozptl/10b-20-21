public abstract class KFZ extends FAHRZEUG{
    //Attribute 
    MOTOR motor;
    
    //Konstruktoren (kein Rückgabetyp, gleicher Name wie Klasse)
    public KFZ(String NFa, String NHe, double NHub){
        super(NFa, NHe, 0);
        motor = new MOTOR(NHub);
        Hoechstgeschwindigkeit = motor.berechneHoechstgeschwindigkeit();
    }        
    
    //Die toString-Methode liefert eine Textrepräsentation des Objekts
    public String toString(){
        return "KFZ-Objekt: " + Hersteller + " " + Farbe 
        + " " + motor.Hubraum + " " + Geschwindigkeit;
    }    
    
    //Auto soll nur beschleunigen und bremsen, wenn Motor läuft
    public void beschleunigen(int kmh){
            if(motor.MotorAn == true){
                super.beschleunigen(kmh);
            }else{
                System.out.println("Motor läuft nicht!");
            }//Prüfung MotorAn Ende
    }    
}

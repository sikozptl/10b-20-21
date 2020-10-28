public abstract class KFZ extends FAHRZEUG{
    //Attribute 
    MOTOR motor;
    
    //Konstruktoren (kein Rückgabetyp, gleicher Name wie Klasse)
    public KFZ(String NFa, String NHe, double NHub){
        super(NFa, NHe, 0);
        motor = new MOTOR(NHub);
        setHoechstgeschwindigkeit(motor.berechneHoechstgeschwindigkeit());
    }        
    
    //Die toString-Methode liefert eine Textrepräsentation des Objekts
    public String toString(){
        return "KFZ-Objekt: " + getHersteller() + " " + getFarbe() 
        + " " + motor.getHubraum() + " " + getGeschwindigkeit();
    }    
    
    //Auto soll nur beschleunigen und bremsen, wenn Motor läuft
    public void beschleunigen(int kmh){
            if(motor.getMotorAn() == true){
                super.beschleunigen(kmh);
            }else{
                System.out.println("Motor läuft nicht!");
            }//Prüfung MotorAn Ende
    }    
}

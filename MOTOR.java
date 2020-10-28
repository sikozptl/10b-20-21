public class MOTOR{
    
    //Attribute 
    private double Leistung;
    private boolean MotorAn;
    private double Hubraum;
    
    //Konstruktoren (kein Rückgabetyp, gleicher Name wie Klasse)
    public MOTOR(double NHub){
        Hubraum = NHub;
        Leistung = berechneLeistung();
        MotorAn = false; //Motor läuft nicht
    }        
    
    public double getLeistung(){
        return Leistung;
    }
    
    public boolean getMotorAn(){
        return MotorAn;
    }
    
    public double getHubraum(){
        return Hubraum;
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
}

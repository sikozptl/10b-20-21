public class AMPEL{
    //Attributliste
    private SPIELWALZE walze1;
    private SPIELWALZE walze2;
    private SPIELWALZE walze3;    
    private String zustand;

    //Konstruktor
    public AMPEL(){
        walze1 = new SPIELWALZE(100,100,100,4);
        walze2 = new SPIELWALZE(100,200,100,6);
        walze3 = new SPIELWALZE(100,300,100,2);
        zustand = "aus";
    }
    
    //Methoden
    //0 schwarz 1 blau 2 gruen 3 hellblau 4 rot
    //5 pink 6 gelb 7 grau 8 weiß 9 schwarz
    public void schalteGruen(){
        walze1.faerbeUm(7);
        walze2.faerbeUm(7);
        walze3.faerbeUm(2);
        zustand = "gruen";
    }
    
    public void schalteRot(){
        walze1.faerbeUm(4);
        walze2.faerbeUm(7);
        walze3.faerbeUm(7);
        zustand = "rot";
    }
    
    public void schalteRotGelb(){
        walze1.faerbeUm(4);
        walze2.faerbeUm(6);
        walze3.faerbeUm(7);
        zustand = "rotgelb";
    }    
    
    public void schalteGelb(){
        walze1.faerbeUm(7);
        walze2.faerbeUm(6);
        walze3.faerbeUm(7);
        zustand = "gelb";
    }    
    
    public void umschalten(){
        if(zustand =="rot"){
            schalteRotGelb();
        }else{
            if(zustand=="rotgelb"){
                schalteGruen();
            }else{
                if(zustand == "gruen"){
                    schalteGelb();
                }else{
                    if(zustand == "gelb"){
                        schalteRot();
                    }
                }
            }
        }
    }
    
    public void umschalten2(){
        switch(zustand){
            case "rot" : 
                schalteRotGelb();
                break;
            case "rotgelb" : 
                schalteGruen();
                break;
            case "gruen" : 
                schalteGelb();
                break;
            case "gelb" : 
                schalteRot();
                break;
        }//Switch Ende
    }//umschalten2 Ende
    
}//Klasse Ende

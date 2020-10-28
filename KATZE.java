public class KATZE{

    //Attributliste
    //private sonst kann jeder die Größe beliebig ändern
    private int groesse;
    
    //Konstruktor
    public KATZE(){
       groesse = 5;
    }

    //getter Methode
    public int getGroesse(){
        return groesse;
    }
    
    //setter Methode
    public void setGroesse(int g){
        //Wenn g>5 ist, dann g übernehmen, sonst nicht
        if(g>5){
            groesse = g;
        }
    }
}

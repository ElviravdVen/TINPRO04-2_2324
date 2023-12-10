package week2.static_brandalarm;

public class Appartement {
    /************** FIELDS **************/
    private int huisnummer;
    public /*static*/ boolean brandalarm = false;
    
    /************** CONSTRUCTOR(S) **************/
    public Appartement(int huisnummer) {
        this.huisnummer = huisnummer;
    }

    /************** GET/SET METHODS **************/
    public int getHuisnummer() {
        return this.huisnummer;
    }

    /************** ANDERE METHODS **************/
    public /*static*/ void toggleBrandalarm() {
        brandalarm = !brandalarm;
    }
}
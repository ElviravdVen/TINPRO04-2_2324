/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   08/01/2024          *                                                                                          *
 *******************************/

package week7;

public class Vliegtuig extends Voertuig{
    private String vertrekTijd;
    private String bestemming;

    public Vliegtuig(String kleur, int aantalWielen, String vertrekTijd, String bestemming) {
        super(kleur, aantalWielen);
        this.vertrekTijd = vertrekTijd;
        this.bestemming = bestemming;
    }

    public void stijgOp(){
        System.out.println("Whiiiiii");
    }

    public String plan(String bestemming, String vertrekTijd){
        return  "We vertrekken naar " + bestemming + " om " + vertrekTijd + " uur.";
    }
}
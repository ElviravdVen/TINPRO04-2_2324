/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   08/01/2024          *                                                                                          *
 *******************************/

package week7;

public class Voertuig {
    protected String kleur;
    private int aantalWielen;

    public Voertuig(String kleur, int aantalWielen) {
        this.kleur = kleur;
        this.aantalWielen = aantalWielen;
    }

    public String getKleur() {
        return kleur;
    }

    public int getAantalWielen() {
        return aantalWielen;
    }

}
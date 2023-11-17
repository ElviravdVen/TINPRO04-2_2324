/* *****************************
 * Author: ELvira van der Ven  *
 * Date:   17/11/2023          *                                                                                          *
 *******************************/

package week1;

public class Gebouw {
    private int aantalVerdiepingen;
    private String kleur;
    private String typeDak;

    public Gebouw(int aantalVerdiepingen, String kleur, String typeDak) {
        this.aantalVerdiepingen = aantalVerdiepingen;
        this.kleur = kleur;
        this.typeDak = typeDak;
    }

    public void pasGebouwKleurAan(String kleur){
        this.kleur = kleur;
    }

    @Override
    public String toString() {
        return "Gebouw{" +
                "aantalVerdiepingen=" + aantalVerdiepingen +
                ", kleur='" + kleur + '\'' +
                ", typeDak='" + typeDak + '\'' +
                '}';
    }
}
/* *****************************
 * Author: ELvira van der Ven  *
 * Date:   13/11/2023          *                                                                                          *
 *******************************/

package week1;
import java.util.random.RandomGenerator;

public class Persoon {
    private int persoonID;
    private String naam;
    private int leeftijd;

    public Persoon() {
        this.persoonID = RandomGenerator.getDefault().nextInt();
        this.naam = "persoon nr " + this.persoonID;
    }

    @Override
    public String toString() {
        return "Persoon {" +
                "\n\tpersoonID=" + persoonID +
                ", \n\tnaam='" + naam + '\'' +
                ", \n\tleeftijd=" + leeftijd +
                "\n}";
    }



    public Drankje haalDrankje(){
        int tijdstip = RandomGenerator.getDefault().nextInt(0,24);
        Drankje drankje = new Drankje();

        // Aan de hand van de flowchart schrijf hier je code en vul de naam van het drankje op de volgende manier in:
        // drankje.setNaam("<Drankje naam>");

        // Schrijf hier je code


        return drankje;
    }

    public int getPersoonID() {
        return persoonID;
    }

    public void setPersoonID(int persoonID) {
        this.persoonID = persoonID;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }
}
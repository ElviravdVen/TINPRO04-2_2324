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
        // Schrijf hier je code
        //als het tijdstip < 16 uur en tijdstip > 6 uur == als het overdag is
        System.out.println("Tijdstip: " + tijdstip);
        if(tijdstip < 16  && tijdstip > 6){
            //nextBoolean returnt een boolen == een waar of onwaar waarde
            if(RandomGenerator.getDefault().nextBoolean()){
                drankje.setNaam("Koffie");
            }
            else {
                drankje.setNaam("Thee");
            }
        }
        else {
            //als < 18  -> cola
            if(this.leeftijd < 18)
            {
                drankje.setNaam("Cola");

            }
            //als >18 && < 21 : mag bier
            else if (this.leeftijd > 18 && this.leeftijd < 21) {
                if(RandomGenerator.getDefault().nextBoolean()) {
                    drankje.setNaam("Bier");
                }
                else{
                    drankje.setNaam("Cola");
                }
            }
            //anders: je mag alles drinken wat je wilt. Kiezen maar (random)!
            else
            {
                int keuzeNummer = RandomGenerator.getDefault().nextInt() %5;
                if(keuzeNummer == 0) {
                    drankje.setNaam("Sterke drank");
                } else if (keuzeNummer == 1){
                    drankje.setNaam("Bier");
                } else if (keuzeNummer == 2) {
                    drankje.setNaam("Koffie");
                } else if (keuzeNummer == 3) {
                    drankje.setNaam("Thee");
                }
                else {
                    drankje.setNaam("Frisje");
                }

                //Andere manier om het bovenstaande uit te werken is een switch
                // ipv een heel lange if-else constructie
                switch (keuzeNummer) {
                    case 0 -> drankje.setNaam("Sterke drank");
                    case 1 -> drankje.setNaam("Bier");
                    case 2 -> drankje.setNaam("Koffie");
                    case 3 -> drankje.setNaam("Thee");
                    case 4 -> drankje.setNaam("Bier");
                    case 5 -> drankje.setNaam("Frisje");
                }
            }

        }

        //anders
        //meer keuze

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
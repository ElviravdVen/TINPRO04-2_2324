/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   20/11/2023          *                                                                                          *
 *******************************/

package week2;

public class Student {
    int studentNummer;
    String naam;
    String adres;
    int geboortejaar;
    String geboorteDatum;
    String rekenignummer;
    String emailAdres;
    String mobiel;

    public Student(int studentNummer, String naam) {
        this.studentNummer = studentNummer;
        this.naam = naam;
    }

    public Student() {
    }

    public Student(int studentNummer, String naam, String adres, int geboortejaar, String geboorteDatum, String rekenignummer, String emailAdres, String mobiel) {
        this.studentNummer = studentNummer;
        this.naam = naam;
        this.adres = adres;
        this.geboortejaar = geboortejaar;
        this.geboorteDatum = geboorteDatum;
        this.rekenignummer = rekenignummer;
        this.emailAdres = emailAdres;
        this.mobiel = mobiel;
    }
}
package week2.static_brandalarm;

/**
 * Matej Skelo (m.skelo@hr.nl) - 2023/11/24
 * Spelen met static
 */

public class App {
    public static void main(String[] args) {
        Appartement[] flatgebouw = {
            new Appartement(1),
            new Appartement(2),
            new Appartement(3)
        };

         flatgebouw[0].toggleBrandalarm();
        // Haal de comments in Appartement.java weg om de volgende regel uit te voeren
         // Appartement.toggleBrandalarm();

        for(int i = 0; i<flatgebouw.length; i++) {
            System.out.println("Het brandalarm van huisnummer " + flatgebouw[i].getHuisnummer() + " is " + flatgebouw[i].brandalarm);
        }

    }
}

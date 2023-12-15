/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   15/12/2023          *                                                                                          *
 *******************************/

package week5.les10;

public class Makelaar {
    public static void main(String[] args) {
        Huis huis = new Huis();
        Bewoner bewoner = new Bewoner();

        Makelaar makelaar = new Makelaar();
        makelaar.koppelHuisAanBewoner(huis, bewoner);

        // Hiermee roep ik een methode aan met anonieme objecten als parameter
        makelaar.koppelHuisAanBewoner(new Huis(), new Bewoner());

    }
    public void koppelHuisAanBewoner(Huis h, Bewoner b){
        h.setBewoner = b;
        b.setHuis = h;
    }
}
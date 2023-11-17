/* *****************************
 * Author: ELvira van der Ven  *
 * Date:   13/11/2023          *                                                                                          *
 *******************************/

package week1;

import java.util.random.RandomGenerator;

public class App {
    public static void main(String[] args) {
        Persoon persoon1 = new Persoon();
        persoon1.setLeeftijd(RandomGenerator.getDefault().nextInt(5, 99));
        System.out.println(persoon1.toString());

        System.out.println("Persoon haalt drankje op: ");
        System.out.println(persoon1.haalDrankje().toString());

        Gebouw flat = new Gebouw(3, "rood", "plat");
        flat.pasGebouwKleurAan("blauw");
        System.out.println(flat.toString());
    }
}
/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   04/12/2023          *                                                                                          *
 *******************************/

package week4;

//import static java.lang.StringTemplate.STR;

public class Auto {
    private int prijs;

    public Auto() {
        this.prijs = 0;
    }



    public void printAuto() {
        System.out.println("Auto { " +
                "\n \tprijs = " + prijs +
                ";\n}");
    }

//    public void printAuto_Java22() {
//        System.out.println(STR."""
//                Auto {
//                   prijs = x;
//                }""");
//    }
}
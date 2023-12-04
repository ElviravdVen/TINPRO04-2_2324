/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   01/12/2023          *                                                                                          *
 *******************************/

package week3.les6;

public class App {
    public static void main(String[] args) {
      Factory fabriek = new Factory();

      Material ijzer = new Iron();
      System.out.println(ijzer.getClass().getSimpleName());

      fabriek.processMaterial(ijzer);

      Material plastic = new Plastic();
      System.out.println();
      System.out.println(plastic.getClass().getSimpleName());

      fabriek.processMaterial(plastic);

    }



}
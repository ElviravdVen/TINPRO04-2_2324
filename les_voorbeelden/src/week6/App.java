/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   18/12/2023          *                                                                                          *
 *******************************/

package week6;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.telOp(5, 3));
        System.out.println(calc.telOp("Hallo", " TI1B"));
        System.out.println(calc.telOp("Hallo ", 1235));

    }
}
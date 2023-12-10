/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   04/12/2023          *                                                                                          *
 *******************************/

package week4;

public class Opel extends Auto{
    private String type;

    public Opel() {
        this.type = this.getClass().getSimpleName();
    }

    @Override
    public void printAuto() {
        super.printAuto();
        System.out.println("Opel {" +
                "\n\ttype = '" + type + "\';" +
                "\n}");
        System.out.println(this.toString());
    }

    public void printAuto(String extra){
        this.printAuto();
        System.out.println(extra);
    }

    @Override
    public String toString() {
        return "\nIn de toString methode: \nOpel {" +
                "\n\ttype = '" + type + '\'' +
                "\n}";
    }
}
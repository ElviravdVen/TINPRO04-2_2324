/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   04/12/2023          *                                                                                          *
 *******************************/

package week3.les6;

public class Painter extends Machine{
    public Material process(Material material){
        if(material instanceof Plastic) {
            ((Plastic) material).setColor("blue");
            System.out.println(material.getClass().getSimpleName() + " " + material.getShape().toLowerCase()
                    + " is being painted " + ((Plastic) material).getColor() + ".");

        }
        else {
            System.out.println(this.getClass().getSimpleName() + " only works on plastic. " +
                    "No action requered on iron.");
        }
        return material;
    }

}
/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   04/12/2023          *                                                                                          *
 *******************************/

package week3.les6;

public class Rivetter extends Machine{

    public Material process(Material material){
        if(material instanceof Iron) {
            if(material.getShape().equalsIgnoreCase("plate")){
                System.out.println(material.getClass().getSimpleName() + " " + material.getShape().toLowerCase()
                        + " is being rivited.");
                ((Iron) material).setRivited();
            }
            else {
                System.out.println(material.getClass().getSimpleName() + " can not be rivited, it's not shaped yet.");
            }
        }
        else {
            System.out.println(this.getClass().getSimpleName() + " only works on iron. " +
                    "No action requered on plastic material.");
        }
        return material;
    }
}
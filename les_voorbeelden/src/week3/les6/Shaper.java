/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   04/12/2023          *                                                                                          *
 *******************************/

package week3.les6;

import java.util.Locale;

public class Shaper extends Machine{
    public Material process(Material material){
        if(material.isMolten()){
            if (material instanceof Iron){
                material.setShape("Plate");
            }
            else if(material instanceof Plastic){
                material.setShape("Cube");
            }
            System.out.println(material.getClass().getSimpleName() + " is shaped in "
                    + material.getShape().toLowerCase() + " form.");
        }
        else {
            System.out.println("Material is not molted yet. Can't be processed by "
                    + this.getClass().getSimpleName());
        }
        return material;
    }
}
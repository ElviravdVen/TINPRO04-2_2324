/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   01/12/2023          *                                                                                          *
 *******************************/

package week3.les6;

public class Smelter {
    private int temperature;

    public Smelter(int temperature) {
        this.temperature = temperature;
    }

    public void process(Material material){
        //mag smelten alleen als de temperatuur hoger is dan de smelt temperatuur van materiaal
        if(this.temperature > material.getMeltingPoint()){
            System.out.println(material.getClass().getSimpleName() + " is being melted.");
            material.setMolten();
        }
        else {
            System.out.println("Temperatuur is too low, " + material.getClass().getSimpleName() +
                            " is melted at a temperature of " + material.getMeltingPoint() + " degrees C. " +
                            "Current temperature is " + this.temperature + " degrees C.");
        }
    }

}
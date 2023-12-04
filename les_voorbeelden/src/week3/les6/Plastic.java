/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   01/12/2023          *                                                                                          *
 *******************************/

package week3.les6;

public class Plastic extends Material{
    private String color;

    //Plastic -> smelten -> vormen naar kubus -> verven


    public Plastic() {
        super();
        this.color = "";
        this.setMeltingPoint(300);
    }

    public void print(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Plastic{" +
                "color='" + color + '\'' +
                '}';
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
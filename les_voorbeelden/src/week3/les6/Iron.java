/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   01/12/2023          *                                                                                          *
 *******************************/

package week3.les6;

public class Iron extends Material{
    private Boolean rivited;
    private Boolean polished;

    public Iron() {
        super();
        this.rivited = false;
        this.polished = false;
        this.setMeltingPoint(1600);
    }

    //IJzer -> smelten -> vormen naar plaat -> polijsten -> klinken

    public void print(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Iron{" +
                "rivited=" + rivited +
                ", polished=" + polished +
                '}';
    }

    public void setRivited() {
        this.rivited = true;
    }

    public void setPolished() {
        this.polished = true;
    }
}
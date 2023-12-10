/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   08/12/2023          *                                                                                          *
 *******************************/

package week4.les8;

public class AdvancedDrone extends Drone{
    protected String tools;

    public AdvancedDrone(String type, int id, String gripper, String tools){
        super(type, id);
        this.gripper = gripper;
        this.tools = tools;
    }

    public void performTask(Task task){
        //to do:
        //if the drone can handle the task, execute it.
        //else, upgrade (create a drone one complexity level higher and overwrite the current drone with it in the static array drones)
        //Have the new drone attempt the same task again.
    }

    public void printInfo(){
        //to do:
        //print all properties of the drone
    }
}
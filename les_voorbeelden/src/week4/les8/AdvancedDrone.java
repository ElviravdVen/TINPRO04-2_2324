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
        System.out.println("\nAdvanced drone " + this.id + " initiates task.");
        //if the drone can handle the task, execute it.
        if(task.getType().equalsIgnoreCase("advanced")){
            System.out.println("Advanced task performed by drone: " + this.id);
        }
        //else, upgrade (create a drone one complexity level higher and overwrite the current drone with it in the static array drones)
        else{
            System.out.println("Error: task failed due to complexity. Upgrading...");
            CentralIntelligence.drones[this.id] = new SpecializedDrone("specialized", this.id, "specialized gripper", "specialized tools", "specialized sensors");
            CentralIntelligence.drones[this.id].performTask(task);
        }
        //Have the new drone attempt the same task again.
    }

    public void printInfo(){
        //to do:
        //print all properties of the drone
        super.printInfo();
        System.out.println("\ttools = " + tools);
    }
}
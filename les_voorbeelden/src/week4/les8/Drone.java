/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   08/12/2023          *                                                                                          *
 *******************************/

package week4.les8;

public class Drone {
    protected int id;
    protected String type;
    protected String gripper = "regular gripper";

    public Drone(String type, int id){
        this.id = id;
        this.type = type;
    }

    public void performTask(Task task){
        //to do:
        System.out.println("\nSimple drone " + this.id + " initiates task.");
        //if the drone can handle the task, execute it.
        if(task.getType().equalsIgnoreCase("simple")){
            System.out.println("Simple task performed by drone: " + this.id);
        }
        //else, upgrade (create a drone one complexity level higher and overwrite the current drone with it in the static array drones)
        else{
            System.out.println("Error: task failed due to complexity. Upgrading...");
            CentralIntelligence.drones[this.id] = new AdvancedDrone("advanced", this.id, "advanced gripper", "advanced tools");
            CentralIntelligence.drones[this.id].performTask(task);
        }
        //Have the new drone attempt the same task again.
    }

    public void printInfo(){
        //to do:
        //print all properties of the drone
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "\nDrone id = " + id + ":"+
                "\n\ttype = " + type +
                "\n\tgripper = " + gripper;
    }
}
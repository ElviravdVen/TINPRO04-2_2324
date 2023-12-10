/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   08/12/2023          *                                                                                          *
 *******************************/

package week4.les8;

public class SpecializedDrone extends AdvancedDrone{
    protected String sensors;

    public SpecializedDrone(String type, int id, String gripper, String tools, String sensors){
        super(type, id, gripper, tools);
        this.sensors = sensors;
    }

    public void performTask(Task task){
        //to do:
        System.out.println("\nSpecialized drone " + this.id + " initiates task.");
        //if the drone can handle the task, execute it.
        if(task.getType().equalsIgnoreCase("specialized")){
            System.out.println("Specialized task performed by drone: " + this.id);
        }
        //else, upgrade (create a drone one complexity level higher and overwrite the current drone with it in the static array drones)
        else{
            System.out.println("Error: task failed due to complexity. ");
            System.out.println("Task cannot be executed. Aborting.");
        }
        //Have the new drone attempt the same task again.
    }

    public void printInfo(){
        //to do:
        //print all properties of the drone
        super.printInfo();
        System.out.println("\tsensors = " + sensors);
    }
}
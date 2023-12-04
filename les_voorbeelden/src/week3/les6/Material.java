/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   01/12/2023          *                                                                                          *
 *******************************/

package week3.les6;

public class Material {
    private String shape;
    private int meltingPoint;
    private Boolean molten;

    public Material() {
        this.shape = "";
        this.meltingPoint=0;
        this.molten = false;
    }

    private void print(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Material{" +
                "shape='" + shape + '\'' +
                ", meltingPoint=" + meltingPoint +
                ", molten=" + molten +
                '}';
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getMeltingPoint() {
        return meltingPoint;
    }

    public void setMeltingPoint(int meltingPoint) {
        this.meltingPoint = meltingPoint;
    }

    public Boolean isMolten(){
        return this.molten;
    }

    public void setMolten() {
        this.molten = true;
    }
}
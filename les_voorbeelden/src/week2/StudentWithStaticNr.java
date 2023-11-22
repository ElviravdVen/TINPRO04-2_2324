/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   22/11/2023          *                                                                                          *
 *******************************/

package week2;

public class StudentWithStaticNr {
    public static int countStudents;
    public int studentNumber;
    private String name;

    public StudentWithStaticNr() {
        this.studentNumber = countStudents + 1;
        countStudents++;
    }
}
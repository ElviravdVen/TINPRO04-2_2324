/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   20/11/2023          *                                                                                          *
 *******************************/

package week2;

public class App {
    public static void main(String[] args) {
//        Student jantje = new Student("Jan");
//        Student klaas = new Student(107859494,"Klaas");
        Student stud = new Student();

        StudentWithStaticNr stud1 = new StudentWithStaticNr();
        StudentWithStaticNr stud2 = new StudentWithStaticNr();
        System.out.println("Totaal aantal studenten: "+ StudentWithStaticNr.countStudents);
        System.out.println(stud1.studentNumber);
        System.out.println(stud2.studentNumber);
    }
}
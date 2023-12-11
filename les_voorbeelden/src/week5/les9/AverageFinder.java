/* *****************************
 * Author: Elvira van der Ven  *
 * Date:   10/12/2023          *                                                                                          *
 *******************************/

package week5.les9;

public class AverageFinder {
    public static void main(String[] args) {
        System.out.println("Average finder v0.1");
        System.out.println("Running with arguments:");
        for(String s : args){
            System.out.println(s);
        }
        double avg = findAverage(args);
        System.out.println("The average is " + avg);
//        Rekenmachine rm = new Rekenmachine();
//        System.out.println(rm.telOp(5.5, 7.3));
//
//        System.out.println(rm.telOp(5, 7.3));
//
//        System.out.println(rm.telOp("5", 7));
    }

    private static double findAverage(String[] input) {
        double result = 0;
        for (String s : input) {
            result += Integer.parseInt(s);
        }
        return result/input.length;
    }
}
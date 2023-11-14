/* *****************************
 * Author: ELvira van der Ven  *
 * Date:   14/11/2023          *                                                                                          *
 *******************************/

public class App {
    public static void main(String[] args) {
        var flat = new Gebouw(5,"rood", "plat");
        flat = flat.verf("bruin");

        System.out.println(flat);

        String aap = "aap";

        String result =
                switch (aap){
            case "aap" -> "noot";
            case "noot" -> "mies";
            case "mies", "anders" -> "aap";
            default -> "dan niet joh";
        };
        System.out.println(result);

    }


}
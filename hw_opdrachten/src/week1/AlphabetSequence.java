/* *****************************
 * Author: ELvira van der Ven  *
 * Date:   13/11/2023          *                                                                                          *
 *******************************/

/*
Bouw een programma wat:
-	Een getal aan de gebruiker kan vragen
-	Het gegeven getal gebruikt om letters uit het alfabet op het scherm te printen in regels
o	Per regel komt er steeds 1 letter bij, totdat er net zoveel letters op de regel staan als het getal wat opgegeven is
o	Bij ‘5’, print je 5 rijen, bij ‘6’ 6, enz.
o	Voorbeeldoutput bij input ‘5’:
A
A B
A B C
A B C D
A B C D E
-	Bij input > 26 kom je na de ‘Z’ weer uit bij ‘A’ en ga je opnieuw het alfabet af.
-	Zorg dat het programma niet kan crashen!
 */


package week1;

import java.util.Scanner;

public class AlphabetSequence {

    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuwvxyz";
        Scanner inputScanner = new Scanner(System.in);
        int gebruikers_input = 0;
        char run = 'j';

        while (run.equalsIgnoreCase("ja")) {
            System.out.println("Voer een positief, geheel getal in:");
            gebruikers_input = inputScanner.nextInt();
            //System.out.println("U hebt " + gebruikers_input + " ingetyped.");

            if(gebruikers_input < 0){
                System.out.println("""
                                Wat is niet te begrijpen aan positief?!
                                Probeer het opnieuw.""");
            }

            for (int i = 0; i < gebruikers_input; i++) {
                for(int j = 0; j < i+1; j++) {
                    System.out.print(alphabet.charAt(j % alphabet.length()) + " ");
                }
                System.out.println();
            }

            //String literals
            System.out.println("""
                    Wilt u nog een getal invoeren? Type dan "Ja"
                    Wilt u afsluiten? Type dan "Nee".""");
            run = inputScanner.next().charAt(0);
        }
    }
}
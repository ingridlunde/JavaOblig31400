package Oblig3;

/* Oppgave - Array
Det skal lages et program som trekker tilfeldige tall og lagrer dem i en array.
Hvor mange tall som skal trekkes er avhengig av arrayets lengde, som er parameter i klassens konstruktør.
(Hele arrayet skal fylles) Programmet skal imidlertid bare lagre de tall som ikke er trukket allerede.
Dvs. arrayet skal inneholde KUN ÈN forekomst av hvert tall.
Alle tall som trekkes skal være i intervallet 100 til 999, begge grenser inkludert.

Når alle tallene er generert og lagret i arrayet,
skal programmet finne den største, minste og gjennomsnittlige verdien av tallene i arrayet.
Til slutt skal programmet skrive ut,
i en meldingsboks, tallene i arrayet, samt resultatet av beregningene som er beskrevet over:
 */

import javax.swing.*;
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;

class UnikeTall {

    private int[] array1;
    private int sum = 0;
    private double gjennomsnitt = 0;

    //Metode for å sette lengden på array   - Konstruktør som mottar lengden fra main
    //konstruktør som skal gi startverdi til lengden på array
     /* Konstruktør som mottar arrayets lengde som parameter og
         oppretter arrayet.  */


    public UnikeTall(int lengde) {
        array1 = new int[lengde];
    }

    // Metode som fyller arrayet med tilfeldige tall
    // Deklarasjon av array for lagring av tilfeldige heltall
    // Generator for å generere tilfeldige nummer

    public void fyllArray() {

        array1:

        for (int i = 0; i < array1.length; i++) {
            int nyttTall = (int) (Math.random() * (900) + 100);
            array1[i] = nyttTall;
        }
    }

    // Metode som skal undersøke om et gitt tall finnes i arrayet fra før. Tallet det letes etter skal mottas som parameter.
    // Metoden skal returnere true hvis talllet finnes i arrayet fra før.
    // legg inn genererte tall og sjekk om de er true false - bruke dette i main Sett Tilfeldige tall metoden

    private settUlikeTall(int nyttTall) {
        boolean test = false;
        if (nyttTall == array1[i]){
            test = true;
        }
        else {
            test = false;
        }
    }

  // Metode som finner og returnerer det minste tallet i arrayet.

     private finnMinsteTallet () {
        for (Integer i = 0; i < array1[0]; ) {
            i = array1[0];
            String ut = "Det minste tallet i arrayet er : " + array1[0];
            System.out.println("\n" + ut);
        }
    }

     // Metode som finner og returnerer det største tallet i arrayet.

     private finnStørsteTallet () {
         Arrays.sort(array1, Collections.reverseOrder());
         for (int j = 0; j < array1[0]; ) {
             j = array1[0];
             String ut = "Det største tallet i arrayet er : " + array1[0];
             System.out.println("\n" + ut);
         }
     }

    /*  Metode som beregner og returnerer den gjennomstnittlige verdien
    (double-verdi) av tallene i arrayet.  */

    private finnGjennomsnitt() {

        for ( i = 0; i < array1.length ; i++ ){
            sum += array1[i];
        }
    }

    private utregningGjennomsnitt ()  {
        double gjennomsnitt = (double) sum / (double) array1.length;
}

    public void arrayUtskrift() {
    for (UnikeTall:
         array1) {
        //if i mod 10 == 1 println;
        //JOptionPane.showMessageDialog(null, utArray);
    }
    String utArray = (array1 + "\n");
    //if i mod 10 == 1 println
    }
}

 class Oppgave1 {
     public static void main(String[] args) {
         UnikeTall LengdeArray = new UnikeTall(7);

         //UnikeTall.arrayUtskrift ();
         System.out.println(LengdeArray);


     }
 }



       // Lag en egen klasse som inneholder main-metoden og som utfører nødvendige instruksjoner for å teste ut metodene i klassen UnikeTall
        // og få vist meldingsboksen på skjermen.


   /* Metode som skal fylle arrayet med tilfeldige tall mellom 100 og 999,
     begge grenser inkludert. Metoden skal gjøre dette på en måte
     som sikrer at alle tallene er forskjellige. Metoden skal ikke ha
     parametre og heller ikke returnere noen verdi.
     Tips bruk (int)(Math.random()*(900)+100); for å generere tallene mellom 100 og 999
   */








   /* Metode som viser tallene i arrayet i en meldngsboks.
     I tillegg skal det, i meldingsboks, skrives ut
     opplysninger om hvilket tall som er minst, hvilket som er størst, og
     hva som er gjennomsnittsverdien, jfr bildet over. Gjennomsnittverdien
     skal skrives ut med en desimal. Bruk gjerne String.format("%.2f,tall) til dette.
     Legg inn mellomrom mellom tallene og skriv ut et passende antall tall
     per linje. */




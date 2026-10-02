// Activitat 27 — Monedes mínimes

import java.util.Scanner;

public class MonedesMinimesCondicional {
    public static void main(String[] args) {
        // TODO: llegeix una quantitat en cèntims (comprova que sigui >= 0)
        //   Mostra la quantitat mínima de monedes de 1, 2, 5, 10, 20, 50, 100 i 200 cèntims
        //   Només mostra les línies amb quantitat > 0

           Scanner teclat = new Scanner(System.in);
        System.out.println("Entra una quantitat en cèntims: ");
        int centims = teclat.nextInt();

        if (centims<=0) {
            System.out.println("No es un numero valid");
        }
        else {

        int monedes200 = centims / 200;
        centims = centims % 200;
        // similar al de las horas, para aprovechar el resto

        int monedes100 = centims / 100;
        centims = centims % 100;

        int monedes50 = centims / 50;
        centims = centims % 50;

        int monedes20 = centims / 20;
        centims = centims % 20;

        int monedes10 = centims / 10;
        centims = centims % 10;

        int monedes5 = centims / 5;
        centims = centims % 5;

        int monedes2 = centims / 2;
        centims = centims % 2;

        int monedes1 = centims;

        System.out.println(monedes200 + " monedes de 2 euros");
        System.out.println(monedes100 + " monedes d'1 euro");
        System.out.println(monedes50 + " monedes de 50 cèntims");
        System.out.println(monedes20 + " monedes de 20 cèntims");
        System.out.println(monedes10 + " monedes de 10 cèntims");
        System.out.println(monedes5 + " monedes de 5 cèntims");
        System.out.println(monedes2 + " monedes de 2 cèntims");
        System.out.println(monedes1 + " monedes de 1 cèntim");
        }
    }
}

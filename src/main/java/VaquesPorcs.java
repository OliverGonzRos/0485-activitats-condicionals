// Activitat 03 — Vaques i porcs

import java.util.Scanner;

public class VaquesPorcs {
    public static void main(String[] args) {
        // TODO: llegeix el número de vaques i de porcs
        //   Calcula el percentatge de cada un sobre el total i mostra'ls
        //   Digues quin dels dos percentatges és més gran (o si empaten)
        
        Scanner teclat = new Scanner(System.in);

        System.out.println("Quants vaques hi ha a la granja? ");
        int vaques = teclat.nextInt();

        System.out.println("Quants porcs hi ha a la granja? ");
        int porcs = teclat.nextInt();

        double total_animals = vaques + porcs;

        double percentatge_vaques = (vaques / total_animals) * 100;
        double percentatge_porcs = (porcs / total_animals) * 100;

        System.out.println("El percentatge es: " + percentatge_vaques + " de vaques i " + percentatge_porcs + " de porcs");

        if  (percentatge_vaques>percentatge_porcs) {
            System.out.println("Hi ha més vaques que porcs!"); }

        if (percentatge_vaques==percentatge_porcs) {
            System.out.println("Hi ha la mateixa quantitat!");
        }
        else { System.out.println("Hi ha més porcs que vaques!");}





    }
}

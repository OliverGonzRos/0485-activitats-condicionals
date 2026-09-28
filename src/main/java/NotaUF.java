// Activitat 04 — Nota d'una UF (mitjana ponderada)

import java.util.Scanner;

public class NotaUF {
    public static void main(String[] args) {
        // TODO: llegeix la nota d'activitats i la nota de proves
        //   La nota final = activitats * 0.10 + proves * 0.90
        //   Mostra la nota final i digues si s'ha aprovat (>= 5) o no

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix la nota de les activitats:");
        double activitats = teclat.nextDouble();

        System.out.println("Introdueix la nota de les proves:");
        double proves = teclat.nextDouble();

        
        double notaFinal = activitats * 0.10 + proves * 0.90;
        System.out.println("La nota final de la UF es: " + notaFinal);

        if (notaFinal>= 5) {
            System.out.println("Has aprovat la UF!");
        }
        else {
            System.out.println("No has aprovat la UF...");
        }
    }
}

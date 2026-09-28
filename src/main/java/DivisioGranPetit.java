// Activitat 07 — Dividir el més gran entre el més petit

import java.util.Scanner;

public class DivisioGranPetit {
    public static void main(String[] args) {
        // TODO: llegeix 2 números diferents
        //   Si són iguals -> "Els números han de ser diferents"
        //   Troba el més gran i el més petit
        //   Si el més petit és 0 -> "El divisor no pot ser 0"
        //   Si no, mostra el resultat de dividir el gran entre el petit
       


    Scanner teclat = new Scanner(System.in);

    System.out.print("Introdueix el primer número: ");
    double num1 = teclat.nextDouble();

    System.out.print("Introdueix el segon número: ");
    double num2 = teclat.nextDouble();

        if (num1 == num2) {
            System.out.println("Els números han de ser diferents");
        } else {
            double gran = Math.max(num1, num2);
            double petit = Math.min(num1, num2);
        

            if (petit == 0) {
                System.out.println("El divisor no pot ser 0");
            } else {
                double resultat = gran / petit;
                System.out.println("El resultat és: " + resultat);
            }
        }

    
    }
}


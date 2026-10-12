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

    System.out.println("Introdueix el primer número: ");
    double num1 = teclat.nextDouble();

    System.out.println("Introdueix el segon número: ");
    double num2 = teclat.nextDouble();

        if (num1 == num2) {
            System.out.println("Els números han de ser diferents");
        } else { if (num1>num2) {
            if (num2 == 0) {
                System.out.println("El divisor no pot ser 0");
            }
             else {
                double resultat = num1 / num2;
                System.out.print("El resultat de dividir " +num1+ " entre " +num2+ " és: " + resultat);
            }
        }

           
        
        if (num2>num1) {
             if (num1 == 0) {
                System.out.println("El divisor no pot ser 0");
            } else {
                double resultat = num2 / num1;
                 System.out.print("El resultat de dividir " +num2+ " entre " +num1+ " és: " + resultat);
            }
        }
           
        }


    }
}


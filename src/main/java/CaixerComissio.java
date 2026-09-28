// Activitat 10 — Caixer, comissió i saldo

import java.util.Scanner;

public class CaixerComissio {
    public static void main(String[] args) {
        // TODO: llegeix el saldo actual, la quantitat a treure i si fas servir caixer propi (S/N)
        //   Si NO és caixer propi, aplica una comissió del 5% sobre la quantitat
        //   Si (quantitat + comissió) > saldo -> "No es pot fer la retirada. Saldo insuficient."
        //   Si no, mostra la quantitat, la comissió (si n'hi ha) i el saldo restant

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix el saldo actual: ");
        double saldo = teclat.nextDouble();

        System.out.println("Introdueix la quantitat a treure: ");
        double quantitat = teclat.nextDouble();
        
        System.out.println("Fas servir caixer propi? (S/N): ");
        String caixer = teclat.next();
        double comissió = 0;

        if (caixer.equalsIgnoreCase("N")) {
            comissió = quantitat * 0.05;
        }

        if (quantitat + comissió > saldo) {
            System.out.println( "No es pot fer la retirada. Saldo insuficient.");
        }

        else {
            double saldoRestant = saldo - quantitat - comissió;
            System.out.println("Quantitat retirada: " + quantitat);
            System.out.println("Comissió: " + comissió);
            System.out.println("Saldo restant: " + saldoRestant);
        }




    }
}

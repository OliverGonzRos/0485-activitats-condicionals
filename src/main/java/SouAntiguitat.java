
import java.util.Scanner;

// Activitat 15 — Sou i antiguitat
public class SouAntiguitat {
    public static void main(String[] args) {
        // TODO: llegeix el sou i els anys d'antiguitat
        //   a) sou < 500 i antiguitat >= 10 -> augment del 20%
        //   b) sou < 500 i antiguitat < 10  -> augment del 5%
        //   c) sou >= 500                   -> sense canvis
        //   Mostra el sou a pagar
        Scanner teclat = new Scanner(System.in);

        System.out.println("Escriu el sou: ");
        int sou = teclat.nextInt();

        System.out.println("Escriu els anys de antiguitat: ");
        int antiguitat = teclat.nextInt();

        if (sou<500 && antiguitat>=10) {
            double souFinal = sou * 1.2;
            System.out.println("El teu sou es: " + souFinal);
        }
        if (sou<500 && antiguitat<10) {
            double souFinal = sou * 1.05;
            System.out.println("El teu sou es: " + souFinal);
        }
        if (sou>500) {
            System.out.println("El teu sou es: " + sou);
        }


    }
}

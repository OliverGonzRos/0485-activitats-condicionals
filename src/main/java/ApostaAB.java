// Activitat 19 — Aposta A o B
// Ajuda: java.util.Random -> random.nextInt(10) + 1

import java.util.Random;
import java.util.Scanner;


public class ApostaAB {
    public static void main(String[] args) {
        // TODO: genera dos números aleatoris A i B (no els mostris encara)
        //   Pregunta per qui aposta l'usuari (A o B); guanya el número més alt
        //   Mostra els dos valors i si ha guanyat o perdut l'aposta
        Scanner teclat = new Scanner(System.in);
        Random generador = new Random();

        int A = generador.nextInt();
        int B = generador.nextInt();

        System.out.println("Por que numero apuestas, el A o el B? ");
        char lletra;
        lletra = teclat.next().charAt(0); 

        if (lletra == 'A' && A>B) {
            System.out.println("Els valors eren: A= " + A + "B= " + B);
            System.out.println("Enhorabona, has guanyat");
        }
         {
            System.out.println("Els valors eren: A= " + A + "B= " + B);
            System.out.println("Mala sort, has perdut");
        }
        if (lletra == 'B' && B>A) {
            System.out.println("Els valors eren: A= " + A + "B= " + B);
            System.out.println("Enhorabona, has guanyat");
        }
        if (lletra == 'B' && B<A) {
            System.out.println("Els valors eren: A= " + A + "B= " + B);
            System.out.println("Mala sort, has perdut");
        }




    }
}

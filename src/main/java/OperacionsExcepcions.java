
import java.util.Scanner;

// Activitat 25 — Operacions aritmètiques amb control d'excepcions
public class OperacionsExcepcions {
    public static void main(String[] args) {
        // TODO: llegeix 2 números enters i mostra suma, resta, multiplicació i divisió
        //   Controla amb try/catch que l'usuari introdueixi números vàlids
        //   Controla que el segon operand no sigui 0 abans de dividir
        try {
            
       
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix un numero enter: ");
        int numero = teclat.nextInt();
        System.out.println("Introdueix altre numero: ");
        int numero2 = teclat.nextInt();

        System.out.println(numero + "+" + numero2 + "=" + (numero + numero2));
        System.out.println(numero + "-" + numero2 + "=" + (numero - numero2));
        System.out.println(numero + "*" + numero2 + "=" + (numero * numero2));

        if (numero2 == 0) {
            System.out.println("Error, el numero 2 no puede ser 0");
        }
        else { 
            System.out.println(numero + "/" + numero2 + "=" + ((double)numero / numero2));
        }

         } catch (Exception e) {
            System.out.println("Error, has introduit numeros no valids");
        }
    }
}

// Activitat 18 — Endevina el número
// Ajuda: java.util.Random -> random.nextInt(10) + 1  (número entre 1 i 10)

import java.util.Random;
import java.util.Scanner;

public class EndevinaNumero {
    public static void main(String[] args) {
        // TODO: genera un número aleatori entre 1 i 10
        //   Demana a l'usuari que l'endevini
        //   Si l'encerta, felicita'l; si no, digues quin número era
        Scanner teclat = new Scanner(System.in);
        Random generador = new Random();

        int numero1 = generador.nextInt(1,11);
        System.out.println("Endevina el numero: ");
        int numero2 = teclat.nextInt();

        if (numero1 == numero2) {
            System.out.println("Molt bé, has encertat!");
        }
        else {
            System.out.println("No has encertat, el numero era " + numero1);
        }
        
    }
}

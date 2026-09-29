// Activitat 18 — Endevina el número
// Ajuda: java.util.Random -> random.nextInt(10) + 1  (número entre 1 i 10)

import java.util.Random;

public class EndevinaNumero {
    public static void main(String[] args) {
        // TODO: genera un número aleatori entre 1 i 10
        //   Demana a l'usuari que l'endevini
        //   Si l'encerta, felicita'l; si no, digues quin número era

        Random generador = new Random();

        int numero = generador.nextInt(1,11);
        System.out.println(numero);
        
    }
}

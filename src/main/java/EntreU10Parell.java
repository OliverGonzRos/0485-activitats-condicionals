
import java.util.Scanner;

// Activitat 14 — Entre 1 i 10 i parell (if-else aniuada)
public class EntreU10Parell {
    public static void main(String[] args) {
        // TODO amb if-else aniuada: llegeix un número enter
        //   Digues si està entre 1 i 10 I, a més, si és parell
        Scanner teclat = new Scanner(System.in);
        System.out.println("Escriu un numero enter: ");
        int numero = teclat.nextInt();

        if (numero>1 && numero<10) {
            System.out.println("El numero esta entre 1 i 10");
            if (numero % 2 == 0) {
                System.out.println("El numero es parell");
            }
            else {
                System.out.println("EL numero no es parell");
            }
        }


    }
}

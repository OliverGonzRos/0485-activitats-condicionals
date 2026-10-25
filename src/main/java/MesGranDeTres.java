
import java.util.Scanner;

// Activitat 12 — El més gran de tres números
public class MesGranDeTres {
    public static void main(String[] args) {
        // TODO: llegeix 3 números i mostra quin és el més gran

    Scanner teclat = new Scanner(System.in);

    System.out.println("Escriu el numero 1: ");
    double num1 = teclat.nextDouble();
    System.out.println("Escriu el numero 2: ");
    double num2 = teclat.nextDouble();
    System.out.println("Escriu el numero 3: ");
    double num3 = teclat.nextDouble();

     double max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        System.out.println("El número més gran és: " + max);

        
    }
}


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

    if (num1>num2 && num1>num3) {
        System.out.println("El numero 1 es el mes gran");
    }
    if (num2>num1 && num2>num3) {
        System.out.println("El numero 2 es el mes gran");
    }
    if (num3>num1 && num3>num2) {
        System.out.println("El numero 3 es el mes gran");
    }

        
    }
}

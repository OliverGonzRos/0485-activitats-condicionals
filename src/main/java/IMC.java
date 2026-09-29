
import java.util.Scanner;

// Activitat 13 — Índex de massa corporal (IMC)
public class IMC {
    public static void main(String[] args) {
        // TODO: llegeix l'altura en cm i el pes en kg
        //   IMC = pes / (altura_en_metres al quadrat)
        //   Classificació OMS: <18.5 Pes insuficient, <25 Pes normal, <30 Sobrepès, >=30 Obesitat

        Scanner teclat = new Scanner(System.in);

        System.out.println("Escriu la teva altura en cm: ");
        double altura = teclat.nextDouble();

        System.out.println("Escriu el teu pes en kg: ");
        double pes = teclat.nextDouble();

        double imc = pes / ((altura * 0.01) * (altura * 0.01));
        System.out.println("El teu IMC es: " + imc);

        if (imc<18.5) {
            System.out.println("Pes insuficient");
        }
        if (imc<25 && imc>18.5) {
            System.out.println("Pes insuficient");
        }



        /*  - Menys de 18.5 → Pes insuficient
        - 18.5 – 24.9 → Pes normal
        - 25.0 – 29.9 → Sobrepès
        - 30.0 o més → Obesitat */
    }
}

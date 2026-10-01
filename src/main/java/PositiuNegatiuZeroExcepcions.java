// Activitat 26 — Positiu, negatiu o zero, amb control d'excepcions

import java.util.Scanner;

public class PositiuNegatiuZeroExcepcions {
    public static void main(String[] args) {
        // TODO: com l'activitat 08, però controla amb try/catch que l'usuari
        //   introdueixi un número enter vàlid

        try {
            

         int num;
        Scanner teclat = new Scanner(System.in);

        System.out.print("Introdueix un numero enter: ");
         num = teclat.nextInt();

         if (num > 0) {
            System.out.println("Es positiu");
         }
         if (num < 0) {
            System.out.println("Es negatiu");
         }
         if (num == 0) {
            System.out.println("Es zero");
         }
         } 
         catch (Exception e) {
            System.out.println("No es un numero valid");
        }
    }
}

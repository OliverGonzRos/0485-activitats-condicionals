// Activitat 08 — Positiu, negatiu o zero

import java.util.Scanner;

public class PositiuNegatiuZero {
    public static void main(String[] args) {
        // TODO: llegeix un número enter i digues si és positiu, negatiu o zero

        int num;
        long startTime, endTime, duration;
        Scanner teclat = new Scanner(System.in);

        System.out.print("Introdueix un numero enter: ");
         num = teclat.nextInt();

         startTime = System.nanoTime();

         if (num > 0) {
            System.out.println("Es positiu");
         }
         if (num < 0) {
            System.out.println("Es negatiu");
         }
         if (num == 0) {
            System.out.println("Es zero");
         }

         // son apunts
         endTime = System.nanoTime();
         duration = endTime - startTime;

         System.out.println("Temps d'execució: " + duration + " nanosegons" );

        

    }
}

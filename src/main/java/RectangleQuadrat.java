// Activitat 06 — Rectangle o quadrat

import java.util.Scanner;

public class RectangleQuadrat {
    public static void main(String[] args) {
        // TODO: llegeix el costat gran i el costat petit d'un rectangle
        //   Mostra el perímetre (costatGran*2 + costatPetit*2) i l'àrea (costatGran*costatPetit)
        //   Digues si és un quadrat (els dos costats iguals) o no

        
        Scanner teclat = new Scanner(System.in);
        
        System.out.println("Introdueix el costat gran: ");
        double costatGran = teclat.nextInt();
        
        System.out.println("Introdueix el costat petit: ");
        double costatPetit = teclat.nextInt();
     
        double perimetre = costatGran * 2 + costatPetit * 2;
        System.out.println("El perimetre es: " + perimetre );
        double area = costatGran * costatPetit;
        System.out.println("El area es: " + area );

        if (costatGran == costatPetit) {
            System.out.println("No es un rectangle");
            System.out.println("Es un quadrat");
        }
        else {
            System.out.println("No es un quadrat");
            System.out.println("Es un rectangle");
        }


    }
}

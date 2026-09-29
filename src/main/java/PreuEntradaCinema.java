
import java.util.Scanner;

// Activitat 11 — Preu d'una entrada de cinema
// Ajuda: per llegir una lletra amb Scanner
//   char lletra = teclat.next().charAt(0);
public class PreuEntradaCinema {
    public static void main(String[] args) {
        // TODO: l'entrada normal val 5€
        //   Un 10% més en cap de setmana (pregunta L=laborable o C=cap de setmana)
        //   Un 15% de descompte addicional amb Carnet Jove (pregunta S/N)
        //   Mostra el preu final
        Scanner teclat = new Scanner(System.in);

        int entrada = 5;


        System.out.println("És un dia laborable (L) o de cap de setmana (C)?" );
        char lletra;
        lletra = teclat.next().charAt(0); 
        System.out.println("Tens carnet jove? (S/N)");
        char carnetJove;
        carnetJove = teclat.next().charAt(0); 

        if (lletra == 'C') { 
            double total = entrada * 1.1;
            if (carnetJove == 'S') {
                total = total * 0.85;
            }
            System.out.println("Preu final = " + total);

         }
         if (lletra == 'L') { 
            double total = entrada;
            if (carnetJove == 'S') {
                total = total * 0.85;
            }
            System.out.println("Preu final = " + total);

         }
         




    }
}

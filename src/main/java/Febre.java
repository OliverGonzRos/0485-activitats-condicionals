
import java.util.Scanner;

// Activitat 01 — Febre
public class Febre {
    public static void main(String[] args) {
        // TODO: llegeix la temperatura (real, per teclat) i digues si hi ha febre
        //   Si temperatura > 37 -> "Tens febre, has d'anar cap a casa a descansar!!"
        //   Si no -> un altre missatge (per exemple, que pot quedar-se)

        Scanner teclat = new Scanner(System.in);
        System.out.println("Introduce tu temperatura: ");
        double temperatura = teclat.nextDouble();

        if (temperatura>=37) {
        System.out.println("Tens febre, descansa");
        System.out.println("Recuperat a casa"); 

        } else {
                System.out.println("No tens febre, que bé");
                System.out.println("Pots quedar-te");
                }

        
            
            

       
            
      
}

}

// Activitat 21 — Pedra, paper o tisora
// Ajuda: java.util.Random -> random.nextInt(3)  (0 pedra, 1 paper, 2 tisora)

import java.util.Random;
import java.util.Scanner;

public class PedraPaperTisora {
    public static void main(String[] args) {
        // TODO: l'ordinador tria a l'atzar pedra, paper o tisora
        //   L'usuari entra la seva opció per teclat
        //   Mostra què ha tret l'ordinador i qui guanya (tisores>paper>pedra>tisores)

        Scanner teclat = new Scanner(System.in);
        Random generador = new Random();
        
        int numero = generador.nextInt(0,3);
        String numero2;

        System.out.println("Entra pedra, paper o tisora: ");
        String eleccio = teclat.next();

        switch (numero) {
            case 0:
                numero2 = "pedra";
                break;
            case 1:
                numero2 = "paper";
                break;
            default:
                numero2 = "tisores";
                break;
        }

        System.out.println("L'ordinador ha tret " + numero2);

        if (eleccio.equals("pedra") && numero2.equals("tisores")) {
            System.out.println("Has guanyat!");
         }else if (eleccio.equals("paper") && numero2.equals("pedra")) {
            System.out.println("Has guanyat!");
         } else if (eleccio.equals("tisores") && numero2.equals("paper")) {
            System.out.println("Has guanyat!");
         }else if (eleccio.equals(numero2)) {
            System.out.println("Heu empatat!");
        }
        else {
            System.out.println("Has perdut");
        }
        







      
    }
}

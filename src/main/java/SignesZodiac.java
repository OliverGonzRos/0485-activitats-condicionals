// Activitat 24 — Signes del zodíac (switch)

import java.util.Scanner;

public class SignesZodiac {
    public static void main(String[] args) {
        // TODO:
        //   a) Mostra el llistat dels 12 signes amb el seu número
        //   b) Demana un número per teclat
        //   c) Amb un switch, mostra la categoria (Foc, Terra, Aire o Aigua)
        //   Si el número no correspon a cap signe: "ERROR: <número> no associat a cap signe."
        /*| 1. Àries | 2. Capricorn | 3. Balança | 4. Cranc |
| 5. Lleó | 6. Taure | 7. Aquari | 8. Escorpió |
| 9. Sagitari | 10. Verge | 11. Bessons | 12. Peixos | */
   Scanner teclat = new Scanner(System.in);
   System.out.println("Llistat signes del zodiac: 1 Àries, 2 Capricorn, 3 Balança, 4 Cranc, 5 Lleó, 6 Taure, 7 Aquari, 8 Escorpió, 9 Sagitari, 10 Verge, 11 Bessons, 12 Peixos.");
   System.out.println("Introdueix el numero del zodiac que vulguis del 1 al 12: ");
   int numero = teclat.nextInt();
   switch (numero) {
       case 1:
        case 5:
            case 9:
                System.out.println("Es de categoria foc");
        break;
        case 2:
            case 6:
                case 10:
                    System.out.println("Es de categoria terra");
        break;
        case 3:
            case 7:
                case 11:
                    System.out.println("Es de categoria aire");
        break;
        case 4:
            case 8:
                case 12:
                    System.out.println("Es de categoria aigua");
           
           break;
       default: System.out.println("ERROR: <número> no associat a cap signe.");
    
   }

    }
}

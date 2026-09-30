
import java.util.Scanner;

// Activitat 20 — Login amb usuari i contrasenya
public class LoginUsuariPassword {
    public static void main(String[] args) {
        // Informació secreta
        final String username = "cponts";
        final String password = "qw34T1234";

        // TODO: demana username i password per teclat
        //   Digues si són correctes o no
        Scanner teclat = new Scanner(System.in);

        System.out.println("Entra el nom d'usuari: ");
        String respostaUsername = teclat.next();
    
        System.out.println("Entra la contrasenya: ");
        String respostaContrasenya = teclat.next();

        if (respostaUsername.equals(username) && respostaContrasenya.equals(password)) {
            System.out.println("Nom d'usuari i contrasenya correctes");
        }
        else {
            System.out.println("El nom d'usuari i/o la contraseña son incorrectes");
        }

}
}
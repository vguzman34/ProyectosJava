import java.util.Random;
import java.util.Scanner;

public class IDUnico {
    public static void main(String[] args) {
        System.out.println("*** Sistema Generador de ID Unico***");
        var consola = new Scanner(System.in);
        var aleatorio = new Random();

        // Solicitamos el nombre del usuario
        System.out.print("Cual es tu nombre?");
        var nombre = consola.nextLine();


        // Solicitamos el apellido
        System.out.print("Cual es tu apellido?");
        var apellido = consola.nextLine();


        // Solicitamos el año de nacimiento
        System.out.print ("Cual es tu año de nacimiento (YYYY)? ");
        var anionacimiento = consola.nextLine();

        // Normalizar los valores
        var nombre2 = nombre.trim().toLowerCase().substring(0,2);
        var apellido2= apellido.trim().toLowerCase().substring(0,2);
        var anionacimiento2 = anionacimiento.trim().substring(2);
// Generar valor aleatorio (1 y 9999)
        var numeroAleatorio = aleatorio.nextInt(9999) + 1;

// Formato de 4 dígitos
        var numeroAleatorioFormato = String.format("%04d", numeroAleatorio);

// Generar ID único
        var idUnico = nombre2 + apellido2 + anionacimiento2 + numeroAleatorioFormato;

// Imprimir el ID único
        System.out.printf("""
    %nHola  %S;
    \tTu nuevo número de identificación (ID) generado por el sistema es:
    \t%S
    \t¡Felicidades jujujuju viva Colombia, viva Falcao el tigre más fuerte que tiene la cancha!
    """, nombre, idUnico);
    }
}

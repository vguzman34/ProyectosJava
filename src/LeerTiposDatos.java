import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        // Leer distintos tipos de datos

        // Leer un tipo int
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad : ");
        var edad = consola.nextLine();
        System.out.println("edad = " + edad);
        // Leer tipo double
        System.out.print("Ingresa tu altura : ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);
        // Consumimor el caracter de salto linea
        consola.nextLine();
        // Leer tipo String
        System.out.println("Ingresa tu nombre : ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
        // Conversión de datos
        System.out.print("Proporciona un valor entero : ");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);
        // Tipo flotante
        System.out.println("Propociona un valor tipo flotante : ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);
        // Double.parseDouble()
        //Boolean.parseBoolean()



    }
}
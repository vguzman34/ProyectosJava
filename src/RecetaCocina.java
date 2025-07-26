import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de cocina ***");
        var consola = new Scanner(System.in);

        //Nombre de receta
        System.out.print("Ingresa el nombre de la receta");
        var nombreReceta = consola.nextLine();

        //Ingredientes
        System.out.print("Ingresa los ingredientes");
        var ingredientes = consola.nextInt();

        // Tiempo de preparacion
        System.out.print("Ingresa el tiempo de preparacion (min): ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        //Difucultad de la preparacion
        System.out.print("Ingresa la dificultad (Facil/Medio/Difucultad :");
        var dificultadPreparacion = consola.nextLine();


        // Imprimir los valores de recetas
        System.out.println("\n--- Receta de cocina ---");
        System.out.println("\tNombre de la receta: " + nombreReceta);
        System.out.println("\tIngredientes : " + ingredientes);
        System.out.println("\tTiempo de preparacion: " + tiempoPreparacion + " minutos");
        System.out.println("\tDificultad: " + dificultadPreparacion);











    }
}

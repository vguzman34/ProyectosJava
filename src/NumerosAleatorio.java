import java.util.Random;

public class NumerosAleatorio {
    public static void main(String[] args) {
        System.out.println("*** Numeros Aleatorios *** ");
        var random = new Random();

        // Generar un numero aleatorio entre 0 y 9
        var numeroAleatorio1 = random.nextInt(10);
        System.out.println("numeroAleatorio entre 0 y 9 = " + numeroAleatorio1);

        // Generar un numero aleatorio entre 1 y 10
        var numeroAleatorio2 = random.nextInt(10) + 1;
        System.out.println("numeroAleatorio entre 1 y 10 = " + numeroAleatorio2);


        // Generar un numero flotante entre 0.0 y 1.0
        var flotanteAleatorio = random.nextFloat();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);

        // Simular el lanzamiento de un dado ( 1 y 6 )
        var dado = random.nextInt(6) + 1;
        System.out.println("dado = " + dado);
        System.out.println("Resultado de lanzar el dado" + dado );



    }
}

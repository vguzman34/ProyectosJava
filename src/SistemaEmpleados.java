import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("***Sistema empelados***");

        var consola = new Scanner(System.in);


        // Nombre de empleados
        System.out.print("Nombre de empleados : ");
        var nombreEmpelado = consola.nextLine();


        // Edad del empleado
        System.out.print(" edad del empleado :");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        //Salario del empleado
        System.out.print("Salario del empleado : ");
        var SalarioEmpleado = Double.parseDouble(consola.nextLine());


        // Es jefe de departamentos
        System.out.print(" Es jefe de departamentos (true/false?: ");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        // Imprimir los valores del empleado
        System.out.println("\nDatos del empleado: ");
        System.out.println("\tNombre: " + nombreEmpelado);
        System.out.println("\tEdad: " + edadEmpleado + " años");
       // System.out.println("\tSalario: " + SalarioEmpleado);
        System.out.println("\tSalario: $%.2f".formatted(SalarioEmpleado));
        System.out.println("\t¿Es Jefe Departamento? " + esJefeDepartamento);







    }
}

public class FormateoCadena {
    public static void main(String[] args) {
        var nombre = "Josvanth";
        var edad = 35;
        var salario = 2100.50;

        // String.format
        var mensaje = String.format("Nombre: %s, edad: %d, salario: %.2f", nombre, edad, salario);
        System.out.println(mensaje);

        // Método printf
        System.out.printf("Nombre: %s, edad: %d, salario: %.2f%n", nombre, edad, salario);
        var numeroEmpleado = 121213;
         mensaje = """
    Detalle persona:
    -------------------
    \tNombre: %s
    \tNoEmpleado: %04d
    \tedad: %d años
    \tsalario: $ %.2f
    """.formatted(nombre, numeroEmpleado, edad, salario);

        System.out.println(mensaje);
    // Formateo de block y prinf directamente
        System.out.printf("""
    Detalle persona:
    -------------------
    \tNombre: %s
    \tNoEmpleado: %04d
    \tedad: %d años
    \tsalario: $ %.2f
    """, nombre, numeroEmpleado, edad, salario);


    }
}
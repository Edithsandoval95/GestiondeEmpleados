// Clase principal del programa
public class Main {
    public static void main(String[] args) {

        // Instanciación de objetos de la clase Empleado
        Empleado empleado1 = new Empleado("Juan Pérez", 30, 12000.50);
        Empleado empleado2 = new Empleado("Ana López", 25, 15000.00);

        // Uso de métodos definidos en la clase
        empleado1.mostrarInformacion();
        empleado2.mostrarInformacion();

        // Probamos un método que modifica el salario
        empleado1.aumentarSalario(2000);
        empleado1.mostrarInformacion();

        // Creación de otro empleado con el constructor vacío
        Empleado empleado3 = new Empleado();
        empleado3.setNombre("Carlos Díaz");
        empleado3.setEdad(40);
        empleado3.setSalario(18000);
        empleado3.mostrarInformacion();
    }
}

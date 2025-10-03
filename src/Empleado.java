/**
 * Clase Empleado representa a un trabajador dentro de la empresa.
 * Contiene atributos básicos como nombre, edad y salario.
 */
public class Empleado {

    // Atributos (propiedades del empleado)
    private String nombre;
    private int edad;
    private double salario;

    /**
     * Constructor vacío
     * Permite crear un objeto sin asignar valores iniciales.
     */
    public Empleado() {
    }

    /**
     * Constructor con parámetros
     * Permite inicializar un empleado con valores.
     */
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    // Métodos GET y SET para encapsulamiento
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Método para mostrar información del empleado
     */
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre +
                " | Edad: " + edad +
                " | Salario: $" + salario);
    }

    /**
     * Método para aumentar el salario del empleado
     * @param incremento Monto a aumentar
     */
    public void aumentarSalario(double incremento) {
        this.salario += incremento;
        System.out.println("El salario de " + nombre + " ha sido aumentado en $" + incremento);
    }
}

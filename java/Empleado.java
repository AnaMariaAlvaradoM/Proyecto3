public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioMensual;
    private static int contadorEmpleados = 0;

    // Constructor
    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = salarioMensual;
        contadorEmpleados++;
    }

    // Métodos get y set para cada variable de instancia
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    // Método para obtener el salario anual
    public double getSalarioAnual() {
        return salarioMensual * 12;
    }

    // Método para obtener el contador de empleados
    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }

    
}




public class EmpleadoTest {
    public static void main(String[] args) {
        // Crear objetos Empleado
        Empleado empleado1 = new Empleado("Juan", "Pérez", 5000);
        Empleado empleado2 = new Empleado("María", "López", 6000);

        // Mostrar salario de cada empleado
        System.out.println("Salario de " + empleado1.getNombre() + ": $" + empleado1.getSalarioMensual());
        System.out.println("Salario de " + empleado2.getNombre() + ": $" + empleado2.getSalarioMensual());

        // Dar a cada empleado un aumento del 10%
        empleado1.setSalarioMensual(empleado1.getSalarioMensual() * 1.1);
        empleado2.setSalarioMensual(empleado2.getSalarioMensual() * 1.1);

        // Mostrar salario anual de cada empleado después del aumento
        System.out.println("Salario anual de " + empleado1.getNombre() + ": $" + empleado1.getSalarioAnual());
        System.out.println("Salario anual de " + empleado2.getNombre() + ": $" + empleado2.getSalarioAnual());

        // Mostrar el contador de empleados
        System.out.println("Total de empleados: " + Empleado.getContadorEmpleados());
    }
}
